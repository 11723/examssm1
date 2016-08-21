package com.zc.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zc.po.AddressInfo;

import com.zc.service.AddressInfoService;


@Controller
public class AddressInfoController {
	@Resource(name="addressInfoServiceImpl")
	private AddressInfoService addrssInfoService;
	
	@RequestMapping("/selectAddress")
	public String addUser(AddressInfo address,Model model){
		
		
		List<AddressInfo> list=addrssInfoService.getAddressList();
		model.addAttribute("list",list);
		return "tianjia";

	}
	
	
}
