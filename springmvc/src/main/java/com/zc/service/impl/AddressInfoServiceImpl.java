package com.zc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zc.mapper.AddressInfoMapper;

import com.zc.po.AddressInfo;
import com.zc.service.AddressInfoService;
@Service
public class AddressInfoServiceImpl implements AddressInfoService {
	@Resource(name="addressInfoMapper")
	private AddressInfoMapper addressInfoMapper;
	public List<AddressInfo> getAddressList() {
		// TODO Auto-generated method stub
		return addressInfoMapper.getAddressList();
	}
	public void setAddressInfoMapper(AddressInfoMapper addressInfoMapper) {
		this.addressInfoMapper = addressInfoMapper;
	}

}
