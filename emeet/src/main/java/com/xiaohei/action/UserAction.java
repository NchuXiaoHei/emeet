package com.xiaohei.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohei.model.User;
import com.xiaohei.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String loginVailet(Model model, HttpSession session, String userId,String pwd) throws Exception {
		System.out.println(userId+" "+pwd);
		User user = new User();
		user = userService.loginValidate(userId, pwd);
		if(user!=null) {
			session.setAttribute("user", user);
			return "test";
		}
		
		return "redirect:../index.jsp";
	}
}
