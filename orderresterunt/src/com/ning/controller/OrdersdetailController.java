package com.ning.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ning.bean.Ordersdetail;
import com.ning.bean.User;
import com.ning.service.IOrdersdetail;

@Controller
@RequestMapping("OrdersdetailController")
public class OrdersdetailController {
	
	@Autowired
	IOrdersdetail iod;
	
	//查询订单明细
	@RequestMapping("findOrdersdetail")
	public String findOrdersdetail(HttpSession session){
		List<Ordersdetail> listOrdersdetail = iod.findOrdersdetail();
		session.setAttribute("listOrdersdetail", listOrdersdetail);
		return "redirect:/ListOrdersdetail.jsp";
	}

}
