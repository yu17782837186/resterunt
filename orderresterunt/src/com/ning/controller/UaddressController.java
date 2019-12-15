package com.ning.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ning.bean.Uaddress;
import com.ning.bean.User;
import com.ning.service.IUaddress;

@Controller
@RequestMapping("UaddressController")
public class UaddressController {
	
	@Autowired
	IUaddress iua;
	
	//添加收货地址
	@RequestMapping("addUaddress")
	public String addUaddress(HttpSession session,String address){
		User user = (User)session.getAttribute("userLogin");
		iua.addUaddress(address,user.getUid());
		return "findUaddress.action";
	}
	
	//查询收货地址
	@RequestMapping("findUaddress")
	public String findUaddress(HttpSession session){
		User user = (User)session.getAttribute("userLogin");
		List<Uaddress> listUaddress = iua.findUaddress(user.getUid());
		session.setAttribute("listUaddress", listUaddress);
		return "redirect:/ListUaddress.jsp";
	}
	
	//删除收货地址
	@RequestMapping("delUaddress")
	public String delUaddress(int aid){
		iua.delUaddress(aid);
		return "findUaddress.action";
	}
	
	//查询用户的收货地址
	
	@RequestMapping("findUserUaddress")
	public @ResponseBody List<Uaddress> findUserUaddress(HttpSession session){
		User user = (User)session.getAttribute("userLogin");
		List<Uaddress> listUserUaddress = iua.findUserUaddress(user.getUid());
		return listUserUaddress;
	}

	
}
