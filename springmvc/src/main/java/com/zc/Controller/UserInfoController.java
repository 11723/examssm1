package com.zc.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zc.po.AddressInfo;
import com.zc.po.UserInfo;
import com.zc.service.UserInfoService;

@Controller
public class UserInfoController {

	@Resource(name="userInfoServiceImpl")
	private UserInfoService userInfoService;  
	@RequestMapping("/addAddress")
	public String addUser1(UserInfo user,Model model){
			
			
			boolean mark=false;
			try {
				mark=userInfoService.addUser(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(mark==true)
			{
			return "tianjia_success";
			}
			else{
				return "tianjia_error";
			}

		}
		
	
	
	@RequestMapping("/selectUser")
	public String selectUser(UserInfo user,Model model){
		System.out.println(user.getFirst_name());
		boolean mark=false;
		
			mark=userInfoService.getUser(user);
		
		if(mark)
		{
			List<UserInfo> list=userInfoService.getUserList();
			model.addAttribute("list",list);
			return "success";
			
		}
		
			return "index1";

	}
	
	
}
