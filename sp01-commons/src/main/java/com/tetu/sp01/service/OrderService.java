package com.tetu.sp01.service;

import com.tetu.sp01.pojo.Order;

public interface OrderService {

	// ��ȡ����
	Order getOrder(String orderId);
	// ���涩��
	void addOrder(Order order);
}
