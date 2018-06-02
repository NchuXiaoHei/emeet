package com.xiaohei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/ower/ch_meeting")
	public String ch_meeting() {
		return "ower/ch_meeting";
	}
	@RequestMapping("/ower/ch_meet_upload")
	public String ch_meet_upload() {
		return "ower/ch_meet_upload";
	}
	@RequestMapping("/particpants/ch_meet_vote")
	public String ch_meet_vote() {
		return "particpants/ch_meet_vote";
	}
	@RequestMapping("/particpants/ch_meet_register")
	public String ch_meet_register() {
		return "particpants/ch_meet_register";
	}
	@RequestMapping("/")
	public String home() {
		return "index"; 
	}
}
