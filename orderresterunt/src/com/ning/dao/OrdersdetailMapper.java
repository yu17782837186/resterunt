package com.ning.dao;

import java.util.List;

import com.ning.bean.Ordersdetail;

public interface OrdersdetailMapper {
	
	public void addOrdersdetail(Ordersdetail od);
	
	public List<Ordersdetail> findOrdersdetail();

}
