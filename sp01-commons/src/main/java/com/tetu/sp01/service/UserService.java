package com.tetu.sp01.service;

import com.tetu.sp01.pojo.User;

public interface UserService {

	// 获取用户
	User getUser(Integer id);
	//  增加用户积分
	void addScore(Integer id, Integer score);
}
