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
		List<Tp_jl> tp_jlList1 = new ArrayList<Tp_jl>();
		List<Tp_jl> tp_jlList2 = new ArrayList<Tp_jl>();
		User user = (User)session.getAttribute("user");		
		tpList = voteService.VoteList(Long.valueOf("2"));		
		for(int i=0;i<tpList.size();i++) {
		tp_jlList = voteService.pxVoteList(Integer.valueOf(tpList.get(i).getTpId()));
		//if(tp_jlList.get(i).getTpId().equals(tpList.get(i).getTpId())) {
			
		//}
		tp_jlList1.addAll(tp_jlList);  //将此会议编号的所有投票记录加入
		}				
		model.addAttribute("list", tpList);
		model.addAttribute("list1", tp_jlList1);
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
			
		    tp_jl.setPx(Integer.valueOf(1));
		}
		if(tp_px1.equals("2")) {
			
		    tp_jl.setPx(Integer.valueOf(0));
		}
		if(voteService.insert(tp_jl)==1) {
			System.out.println("111111");
			return "xxx";
			
		}
		return "particpants/ch_meet_vote";		
	}
	@RequestMapping("/tpList_px")
	public String tp_px(Model model,HttpSession session) {
		List<Tp> tpList = new ArrayList<Tp>();
		List<Tp_jl> tp_jlList = new ArrayList<Tp_jl>();
		List<Tp_jl> tp_jlList1 = new ArrayList<Tp_jl>();
		List<Tp_jl> tp_jlList2 = new ArrayList<Tp_jl>();
		User user = (User)session.getAttribute("user");		
		tpList = voteService.VoteList(Long.valueOf("2"));		
		for(int i=0;i<tpList.size();i++) {
		tp_jlList = voteService.pxVoteList(Integer.valueOf(tpList.get(i).getTpId()));
		if(tp_jlList.get(i).getTpId().equals(tpList.get(i).getTpId())) {
			
		}
		tp_jlList1.addAll(tp_jlList);  //将此会议编号的所有投票记录加入
		}				
		model.addAttribute("list", tpList);
		model.addAttribute("list1", tp_jlList1);
		return "particpants/ch_meet_vote_jl";
		
	}
	
	@RequestMapping("/vote_up")
	public String voteUp(Model model,@RequestParam("note") String note,@RequestParam("hy_id") String hy_id) {
		Tp tp = new Tp();
		tp.setId(Long.valueOf(hy_id));
		tp.setNote(note);
		tp.setTpId(2);
		model.addAttribute("voteList", voteService.VoteList(Long.valueOf(hy_id)));
		return "ower/voteUp";
	}
	
	
	@RequestMapping("/voteDown")
	public String voteDoen(Model model,@RequestParam("hy_id") String hy_id,
			@RequestParam("tp_id") String tp_id) {
		//System.out.println("+"+hy_id);
		voteService.VoteDelete(Long.valueOf(hy_id), Integer.valueOf(tp_id));
		model.addAttribute("voteList", voteService.VoteList(Long.valueOf(hy_id)));
		return "ower/voteUp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
