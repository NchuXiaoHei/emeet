package com.xiaohei.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Tp;
import com.xiaohei.service.VoteService;

@Controller
public class TpController {
	@Autowired
	VoteService voteService;
	@RequestMapping("/tpList")
	public String tp(Model model,HttpSession session) {
		List<Tp> tpList = new ArrayList<Tp>();
		tpList = voteService.VoteList("2");
		model.addAttribute("list", tpList);
		return "particpants/ch_meet_vote";
		
	}
}
