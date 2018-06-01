package com.xiaohei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Ch_Users;
import com.xiaohei.service.Ch_UserService;

@Controller
public class Ch_UsersController {
	@Autowired
	Ch_UserService ch_UserService;
	
	@RequestMapping("/ch_users")
	public String ch_users(Model model, @RequestParam("hy_id") String hy_id ) {
		model.addAttribute("ch_users", ch_UserService.getList(Long.valueOf(hy_id)));
		return "ower/ch_users";
	}
	
	@RequestMapping("/add_ch_user")
	public String add_ch_user(Model model, @RequestParam("hy_id") String hy_id,
			@RequestParam("user_id") String user_id,
			@RequestParam("type") String type) {
		Ch_Users record = new Ch_Users();
		if(type==null) {
			type="普通";
		}
		record.setId(Long.valueOf(hy_id));
		record.setStatus("未签到");
		record.setType(type);
		record.setUserId(Long.valueOf(user_id));
		ch_UserService.insert(record);
		return "ower/ch_users";
	}
}
