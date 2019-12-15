package com.ning.dao;

import java.util.List;

import com.ning.bean.Foods;

public interface FoodsMapper {
	
	public Foods findById(int fid);

	public List<Foods> findAllFoods();

	public void addFoods(Foods foods);

	public List<Foods> findAllFoodsManager();
}
