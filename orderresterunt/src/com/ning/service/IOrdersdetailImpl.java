package com.ning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.Ordersdetail;
import com.ning.dao.OrdersdetailMapper;

@Service
public class IOrdersdetailImpl implements IOrdersdetail {

	@Autowired
	OrdersdetailMapper odm;
	
	@Override
	public void addOrdersdetail(Ordersdetail od) {
		odm.addOrdersdetail(od);
	}

	@Override
	public List<Ordersdetail> findOrdersdetail() {
		return odm.findOrdersdetail();
	}
	
	

}
