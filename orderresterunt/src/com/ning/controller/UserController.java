package com.ning.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ning.bean.User;
import com.ning.service.IUser;

@Controller
@RequestMapping("UserController")
public class UserController {
	
	@Autowired
	IUser iu;

	/**
	 * 功能:登录 
	 */
	@RequestMapping("login")
	public String login(HttpSession session,String uid,String upwd){
		User userLogin = iu.login(uid, upwd);
		if (userLogin!=null) {
			//如果找到这个对象
			//存入session
			session.setAttribute("userLogin", userLogin);
			return "redirect:/demo_main.jsp";
		}else{//找不到这个对象
			return "redirect:/login.jsp";
		}
	}
	
	/**
	 * 功能: 退出
	 */
	@RequestMapping("exitLogin")
	public String exitLogin(HttpSession session){
		session.invalidate();
		return "redirect:/login.jsp";
	}

	/**
	 * 功能:查询个人信息
	 */
	@RequestMapping("findById")
	public String findById(HttpSession session){
		//获取登录者的对象
		User user = (User)session.getAttribute("userLogin");
		User infoUser = iu.findById(user.getUid());
		session.setAttribute("infoUser", infoUser);
		return "redirect:/InfoUser.jsp";
	}
	
	/**
	 * 功能:修改密码 
	 */
	@RequestMapping("updPwd")
	public String updPwd(String uid,String newUpwd){
		//获取登录者的对象
		iu.updPwd(newUpwd,uid);
		return "findById.action";
	}
}
