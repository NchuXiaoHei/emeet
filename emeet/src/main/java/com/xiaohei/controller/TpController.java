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
import com.xiaohei.model.Tp_jl_duo;
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
		List<Integer> list =new ArrayList<Integer>();
		List<Tp> tpList1 = new ArrayList<Tp>();
		tpList = voteService.VoteList(Long.valueOf("2"));	
		User user = (User)session.getAttribute("user");
		System.out.println("****"+user.getUserId());		
		tp_jlList = voteService.hyVoteList(Long.valueOf(user.getUserId()));
		if(tp_jlList.size()>0) {
		for(int i=0;i<tp_jlList.size();i++) {
			list.add(tp_jlList.get(i).getTpId());
		}	
		tpList1 = voteService.notin_Tp(list);
		model.addAttribute("list1", tpList1);
		}
		else
		{
		model.addAttribute("list", tpList);
		model.addAttribute("list1", tpList1);
		}
		return "particpants/ch_meet_vote";//
		
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
			List<Tp> tpList = new ArrayList<Tp>();
			List<Tp_jl> tp_jlList = new ArrayList<Tp_jl>();
			List<Tp_jl> tp_jlList1 = new ArrayList<Tp_jl>();
			List<Tp_jl_duo> tp_list = new ArrayList<Tp_jl_duo>();					
			tpList = voteService.VoteList(Long.valueOf("2"));			
			for(int i=0;i<tpList.size();i++) {
			tp_jlList = voteService.pxVoteList(Integer.valueOf(tpList.get(i).getTpId()));		
			tp_jlList1.addAll(tp_jlList);  //将此会议编号的所有投票记录加入
			}				
			for(int i=0;i<tpList.size();i++) {
				for(int j= 0;j<tp_jlList1.size();j++) {
				if(tp_jlList1.get(j).getTpId().equals(tpList.get(i).getTpId())) {
				String note = tpList.get(i).getNote();
				Integer px = tp_jlList1.get(j).getPx();
				Integer tpId = tp_jlList1.get(j).getTpId();
				Tp_jl_duo tp_duo = new Tp_jl_duo();
				tp_duo.setNote(note);
				if(px==1) {
				    tp_duo.setPx("同意");
				}
				else if(px==0) {
					tp_duo.setPx("反对");
				}
				tp_duo.setTpId(tpId);
				tp_list.add(tp_duo);
			    }	
				}
			}					
			
			model.addAttribute("list2", tp_list);
			return "particpants/ch_meet_vote_jl";
			
		}
		return "particpants/ch_meet_vote";		
	}
	@RequestMapping("/tpList_px")
	public String tp_px(Model model,HttpSession session) {
		List<Tp> tpList = new ArrayList<Tp>();
		List<Tp_jl> tp_jlList = new ArrayList<Tp_jl>();
		List<Tp_jl> tp_jlList1 = new ArrayList<Tp_jl>();
		List<Tp_jl_duo> tp_list = new ArrayList<Tp_jl_duo>();
		User user = (User)session.getAttribute("user");		
		tpList = voteService.VoteList(Long.valueOf("2"));			
		for(int i=0;i<tpList.size();i++) {
		tp_jlList = voteService.pxVoteList(Integer.valueOf(tpList.get(i).getTpId()));		
		tp_jlList1.addAll(tp_jlList);  //将此会议编号的所有投票记录加入
		}	
		System.out.println("###"+tpList.size());
		System.out.println("***"+tp_jlList1.size());
		for(int i=0;i<tpList.size();i++) {
			for(int j= 0;j<tp_jlList1.size();j++) {
			if(tp_jlList1.get(j).getTpId().equals(tpList.get(i).getTpId())) {
			String note = tpList.get(i).getNote();
			Integer px = tp_jlList1.get(j).getPx();
			Integer tpId = tp_jlList1.get(j).getTpId();
			Tp_jl_duo tp_duo = new Tp_jl_duo();
			tp_duo.setNote(note);
			if(px==1) {
			    tp_duo.setPx("同意");
			}
			else if(px==0) {
				tp_duo.setPx("反对");
			}
			tp_duo.setTpId(tpId);
			tp_list.add(tp_duo);
		    }	
			}
		}					
		
		model.addAttribute("list2", tp_list);
		
		return "particpants/ch_meet_vote_jl";
		
	}
	
	@RequestMapping("/voteList")
	public String voteList(Model model,@RequestParam("hy_id") String hy_id) {
		model.addAttribute("voteList", voteService.VoteList(Long.valueOf(hy_id)));
		return "ower/voteUp";
	}
	
	@RequestMapping("/voteUp")
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
