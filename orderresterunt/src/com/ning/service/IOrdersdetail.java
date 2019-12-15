package com.ning.service;

import java.util.List;

import com.ning.bean.Ordersdetail;

public interface IOrdersdetail {

	public void addOrdersdetail(Ordersdetail od);

	public List<Ordersdetail> findOrdersdetail();

}
