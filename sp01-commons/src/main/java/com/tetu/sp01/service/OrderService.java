package com.tetu.sp01.service;

import com.tetu.sp01.pojo.Order;

public interface OrderService {

	// 获取订单
	Order getOrder(String orderId);
	// 保存订单
	void addOrder(Order order);
}
