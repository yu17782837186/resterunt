package com.ning.service;

import java.util.List;

import com.ning.bean.Car;

public interface ICar {

	public void addCar(Car c);
	
	public Car findByIdCar(int fid,String uid);
	
	public void updCnum(int fid,String uid);

	public List<Car> findUserCar(String uid);

	public void delBatch(String[] arrCids);

	public List<Car> findListCar(String[] arrCids);

}
