package com.ning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.Orders;
import com.ning.bean.Ordersdetail;
import com.ning.dao.OrdersMapper;

@Service
public class IOrdersImpl implements IOrders {

	@Autowired
	OrdersMapper om;
	
	/**
	 * 功能:添加订单数据
	 * 需求:添加订单数据
	 */
	@Override
	public void addOrders(Orders o) {
		om.addOrders(o);
	}

	/**
	 * 功能:查询订单
	 * 需求:查询用户自己的订单
	 */
	@Override
	public List<Ordersdetail> findMyOrders(String uid) {
		return om.findMyOrders(uid);
	}

	/**
	 * 功能:发送
	 * 需求:发送所点菜品，即修改派发状态
	 */
	@Override
	public void updOrdersOstatus(String oid) {
		om.updOrdersOstatus(oid);
	}
	
	/**
	 * 功能:签收
	 * 需求:根据商品id，修改派发状态
	 */
	@Override
	public void updOrdersOstatus_2(String oid) {
		om.updOrdersOstatus_2(oid);
	}

}
