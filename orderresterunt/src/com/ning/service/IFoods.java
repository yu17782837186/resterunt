package com.ning.service;

import java.util.List;

import com.ning.bean.Foods;

public interface IFoods {
	
	public Foods findById(int fid);

	public List<Foods> findAllFoods();
	
	public void addFoods(Foods foods);

	public List<Foods> findAllFoodsManager();
	
	
	
}
