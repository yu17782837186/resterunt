package com.ning.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ning.bean.Car;
import com.ning.bean.Foods;
import com.ning.bean.User;
import com.ning.service.ICar;
import com.ning.service.IFoods;

@Controller
@RequestMapping("CarController")
public class CarController {
	
	@Autowired
	ICar ic;
	
	@Autowired
	IFoods ifd;
	
	@RequestMapping("addCar")
	public String addCar(HttpSession session,int fid){
		//获取登录者的对象
		User user = (User)session.getAttribute("userLogin");
		//查询单个商品信息
		Foods foods = ifd.findById(fid);
		//根据刚才点击的商品信息，去用户购物车查看次商品信息
		Car byIdCar = ic.findByIdCar(fid, user.getUid());
		if(byIdCar!=null){//购物车有这个商品，就修改这个商品数量就行
			ic.updCnum(fid, user.getUid());
		}else{//购物车没有此商品，就新增
			Car newCar = new Car();
			newCar.setCmoney(foods.getFmoney());
			newCar.setCname(foods.getFname());
			newCar.setCimage(foods.getFimage());
			newCar.setFid(fid);
			newCar.setUid(user.getUid());
			ic.addCar(newCar);
		}
		return "findUserCar.action";
	}
	
	//查询用户购物车
	@RequestMapping("findUserCar")
	public String findUserCar(HttpSession session){
		User user = (User)session.getAttribute("userLogin");
		List<Car> listCarUser = ic.findUserCar(user.getUid());
		session.setAttribute("listCarUser", listCarUser);
		return "redirect:/ListCar.jsp";
	}  
	
	//批量删除购物车中菜品
	@RequestMapping("delBatch")
	public String delBatch(String cids){
		String[] arrCids = cids.split(",");
		ic.delBatch(arrCids);
		return "findUserCar.action";
	}

}
