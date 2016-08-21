package com.zc.mapper;

import java.util.List;

import com.zc.po.UserInfo;

public interface UserInfoMapper {
	public int addUser(UserInfo user);
	public UserInfo selectUser(UserInfo user);
	public List<UserInfo> getUserList() ;
}
