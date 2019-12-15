package com.ning.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDutil {

	//生成订单id
	public static String getOrdersId() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
		String newTime = sdf.format(d);
		return "o-" + newTime;
	}

	//获取当前系统时间
	public static String nowTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String newTime = sdf.format(d);
		return newTime;
	}
}
