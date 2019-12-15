package com.ning.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ning.bean.Car;

public interface CarMapper {

	public void addCar(Car c);

	public Car findByIdCar(@Param("fid")int fid, @Param("uid")String uid);

	public void updCnum(@Param("fid")int fid, @Param("uid")String uid);

	public List<Car> findUserCar(String uid);

	public void delBatch(String[] arrCids);
	
	public List<Car> findListCar(String[] arrCids);
	
}
