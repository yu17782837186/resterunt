package com.ning.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ning.bean.Car;
import com.ning.bean.Orders;
import com.ning.bean.Ordersdetail;
import com.ning.bean.User;
import com.ning.service.ICar;
import com.ning.service.IOrders;
import com.ning.service.IOrdersdetail;
import com.ning.util.IDutil;

@Controller
@RequestMapping("OrderController")
public class OrderController {
	
	@Autowired
	ICar ic;
	@Autowired
	IOrders io;
	@Autowired
	IOrdersdetail iod;

	/**
	 * 创建订单后，选择自己的收货地址
	 */
	@RequestMapping("createOrder")
	public String createOrder(HttpSession session,String cids){
		String[] arrCids = cids.split(",");
		List<Car> createOrderList= ic.findListCar(arrCids);
		session.setAttribute("createOrderList", createOrderList);
		return "redirect:/createOrder.jsp";
	}
	
	@RequestMapping("submitOrder")
	public String submitOrder(HttpSession session,String cids,String st){
		User user = (User)session.getAttribute("userLogin");
		String[] arrCids = cids.split(",");
		List<Car> carList= ic.findListCar(arrCids);
		//生成订单数据
		Orders o = new Orders();
		o.setOid(IDutil.getOrdersId());
		o.setOnum(carList.size());
		o.setOtime(IDutil.nowTime());
		o.setOaddress(st);
		o.setUid(user.getUid());
		io.addOrders(o);
		for (Car car : carList) {
			//生成订单详情数据
			Ordersdetail od = new Ordersdetail();
			od.setOdnum(car.getCnum());
			od.setOid(o.getOid());
			od.setFid(car.getFid());
			iod.addOrdersdetail(od);
		}
		//同时删除购物车相应的数据
		ic.delBatch(arrCids);
		return "";
	}
	
}
