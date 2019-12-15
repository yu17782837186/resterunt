package com.ning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.Car;
import com.ning.dao.CarMapper;

@Service
public class ICarImpl implements ICar {
	
	@Autowired
	CarMapper cm;

	/**
	 * 功能:添加到购物车
	 */
	@Override
	public void addCar(Car c) {
		cm.addCar(c);
	}

	/**
	 * 功能:查询
	 * 需求:查询购物车中单个购物商品
	 */
	@Override
	public Car findByIdCar(int fid, String uid) {
		return cm.findByIdCar(fid, uid);
	}

	/**
	 * 功能:修改
	 * 需求:根据fid和uid修改购物车商品数量
	 */
	@Override
	public void updCnum(int fid, String uid) {
		cm.updCnum(fid, uid);
	}

	/**
	 * 功能:查询购物车
	 * 需求:查询用户购物车
	 */
	@Override
	public List<Car> findUserCar(String uid) {
		return cm.findUserCar(uid);
	}

	//批量删除购物车中菜品
	@Override
	public void delBatch(String[] arrCids) {
		cm.delBatch(arrCids);
	}

	@Override
	public List<Car> findListCar(String[] arrCids) {
		return cm.findListCar(arrCids);
	}
	

}
