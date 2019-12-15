package com.ning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.Foods;
import com.ning.dao.FoodsMapper;

@Service
public class IFoodsImpl implements IFoods {

	@Autowired
	FoodsMapper fm;
	
	/**
	 * 功能:查询单个
	 * 需求:根据食品id查询单个食品
	 */
	@Override
	public Foods findById(int fid) {
		return fm.findById(fid);
	}

	/**
	 * 功能:显示所有菜品
	 */
	@Override
	public List<Foods> findAllFoods() {
		return fm.findAllFoods();
	}

	
	@Override
	public void addFoods(Foods foods) {
		fm.addFoods(foods);
	}

	@Override
	public List<Foods> findAllFoodsManager() {
		return fm.findAllFoodsManager();
	}
}
