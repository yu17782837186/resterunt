package com.ning.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.ning.bean.Foods;
import com.ning.service.IFoods;

@Controller
@RequestMapping("FoodsController")
public class FoodsController {

	@Autowired
	IFoods ifd;
	
	@RequestMapping("findById")
	public void findById(int fid){
		Foods foods = ifd.findById(fid);
		System.out.println(foods);
	}
	
	/*
	 * 显示图菜品
	 */
	@RequestMapping("findAllFoods")
	public String findAllFoods(HttpSession session){
		List<Foods> listFoodsAll = ifd.findAllFoods();
		session.setAttribute("listFoodsAll", listFoodsAll);
		return "redirect:/ListFoodsAll.jsp";
	}
	
	/*
	 * 菜品列表
	 */
	@RequestMapping("findAllFoodsManager")
	public String findAllFoodsManager(HttpSession session){
		List<Foods> listFoodsAllManager = ifd.findAllFoodsManager();
		session.setAttribute("listFoodsAllManager", listFoodsAllManager);
		return "redirect:/ListFoodsAllManager.jsp";
	}
	
	@RequestMapping("uploadFoods")
	public String uploadFoods(Foods foods,MultipartFile image) throws IllegalStateException, IOException{
		//获取文件名
		String filename = image.getOriginalFilename();
		Foods newFoods = foods;
		newFoods.setFimage(filename);
		//把文件数据添加到数据库
		ifd.addFoods(foods);
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext.getServletContext();
		//获取image的相对路径
		String path = servletContext.getRealPath("image");
		File f = new File(path + "\\" + filename);
		//上传文件到工程名image文件下（本地磁盘）
		image.transferTo(f);
		return "redirect:/findAllFoods.action";
	}
	
}
