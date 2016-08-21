package com.zc.service;

import java.util.List;

import com.zc.po.UserInfo;

public interface UserInfoService {

	public boolean addUser(UserInfo user);
	public boolean getUser(UserInfo user);
	public List<UserInfo> getUserList();
		
	
}
