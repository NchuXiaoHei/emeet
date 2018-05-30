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
import com.xiaohei.model.Tp_jl;
import com.xiaohei.model.User;
import com.xiaohei.service.VoteService;

@Controller
public class TpController {
	@Autowired
	VoteService voteService;
	@RequestMapping("/tpList")
	public String tp(Model model,HttpSession session) {
		List<Tp> tpList = new ArrayList<Tp>();
		List<Tp_jl> tp_jlList = new ArrayList<Tp_jl>();
		User user = (User)session.getAttribute("user");
		tp_jlList = voteService.pxVoteList(String.valueOf(user.getUserId()));
		tpList = voteService.VoteList("2");
		System.out.println("3333");
		model.addAttribute("list", tpList);
		model.addAttribute("list1", tp_jlList);
		return "particpants/ch_meet_vote";
		
	}
	@RequestMapping("/savetp")
	public String save_tp(Model model,HttpSession session ,
			@RequestParam("tp_px1") String tp_px1,
			@RequestParam("tp_id") String tp_id) {
		System.out.println("22222");
		Tp_jl tp_jl = new Tp_jl();		
		tp_jl.setTpId(Integer.valueOf(tp_id));
		User user = (User)session.getAttribute("user");
		tp_jl.setUserId(Long.valueOf(user.getUserId()));
		if(tp_px1.equals("1")) {
			byte[] bt1= {1};
		    tp_jl.setPx(bt1);
		}
		if(tp_px1.equals("2")) {
			byte[] bt2= {0};
		    tp_jl.setPx(bt2);
		}
		if(voteService.insert(tp_jl)==1) {
			System.out.println("111111");
			return "xxx";
			
		}
		return "particpants/ch_meet_vote";		
	}
}
