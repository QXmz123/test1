package com.tetu.sp01.service;

import java.util.List;

import com.tetu.sp01.pojo.Item;

public interface ItemService {

	// 获取指定商品
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
