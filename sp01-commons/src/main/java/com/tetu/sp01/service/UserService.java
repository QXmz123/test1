package com.tetu.sp01.service;

import com.tetu.sp01.pojo.User;

public interface UserService {

	// ��ȡ�û�
	User getUser(Integer id);
	//  �����û�����
	void addScore(Integer id, Integer score);
}
