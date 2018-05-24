package com.xiaohei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/ower/ch_meeting")
	public String ch_meeting() {
		return "ower/ch_meeting";
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
