package com.xiaohei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Hy;
import com.xiaohei.service.MeetService;
import com.xiaohei.service.MeetStatusService;

@Controller
public class MeetStatusController {
	@Autowired
	MeetStatusService meetStatusService;
	@Autowired
	MeetService meetService;
	
	@RequestMapping("/getStatus")
	public String getMeetStatus(Model model, @RequestParam("hy_id") Long id) {
		model.addAttribute("hy_status", meetService.getHyById(id).getStatus());
		return "ower/hy_status";
	}
	
	@RequestMapping("/updateStatus")
	public String updateStatus(Model model, @RequestParam("hy_id") Long id, @RequestParam("hy_status") String status) {
		Hy hy = meetService.getHyById(id);
		hy.setStatus(status);
		meetStatusService.updateHyStatus(hy, status);
		return "ower/hy_status";
	}
}
