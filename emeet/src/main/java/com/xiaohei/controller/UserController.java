package com.xiaohei.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.User;
import com.xiaohei.service.UserService;

@Controller

public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("user/login")
	public String loginVailet(Model model, HttpSession session, @RequestParam("userId") String userId,
			@RequestParam("pwd") String pwd) throws Exception {
		System.out.println(userId+" "+pwd);
		User user = new User();
		user = userService.loginValidate(userId, pwd);
		if(user!=null) {
			session.setAttribute("user", user);
			return "ower/meetUp";
		}
		
		return "index";
	}
}
