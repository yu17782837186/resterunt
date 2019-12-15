package com.ning.dao;

import java.util.List;

import com.ning.bean.Orders;
import com.ning.bean.Ordersdetail;

public interface OrdersMapper {

	public void addOrders(Orders o);
	
	public List<Ordersdetail> findMyOrders(String uid);
	
	public void updOrdersOstatus(String oid);
	
	public void updOrdersOstatus_2(String oid);

}
