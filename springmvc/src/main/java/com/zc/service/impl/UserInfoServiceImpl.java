package com.zc.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zc.mapper.UserInfoMapper;
import com.zc.po.UserInfo;
import com.zc.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService{
@Resource(name="userInfoMapper")
	private UserInfoMapper userInfoMapper;

	public boolean addUser(UserInfo user) {
		int count=userInfoMapper.addUser(user);
		if(count>0){
			return true;
		}
		return false;
	}
	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}
	
	
	public boolean getUser(UserInfo user) {
		UserInfo user1=userInfoMapper.selectUser(user);
		if(user1!=null)
		{
			return true;
		}
		else{
			return false;
		}
	
	}
	public List<UserInfo> getUserList()  {
		
		return userInfoMapper.getUserList();
	}

}
