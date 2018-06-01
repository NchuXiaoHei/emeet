package com.xiaohei.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Tp;
import com.xiaohei.model.User;
import com.xiaohei.model.Zl;
import com.xiaohei.service.UploadService;


@Controller
public class UploadController {
	@Autowired
	UploadService uploadService;	
	@RequestMapping("/addZl")
	public String addupload(Model model,HttpSession session,
			@RequestParam("zl_id") String zl_id,
	        @RequestParam("note") String note,
	        @RequestParam("file_path") String file_path) throws ParseException{
		
		Zl zl =new Zl();
		User user = (User)session.getAttribute("user");
		zl.setZlId(Integer.valueOf(zl_id));
		zl.setId(Long.valueOf("2"));
		zl.setNote(String.valueOf(note));
		String[] file_paths = file_path.split("/");
		file_path = file_paths[file_paths.length-1];
		zl.setFilePath("resources/zl/"+file_path);
		
		if(uploadService.insert(zl)==1) {
			
			return "particpants/ch_meet_upload_ck";
			
		}
		return "../index";
		
	}
	@RequestMapping("/zlList")
	public String tp(Model model,HttpSession session) {
		
		List<Zl> zlList = new ArrayList<Zl>();
		zlList = uploadService.ZlList(Long.valueOf("2"));
		System.out.println("****"+zlList.get(0).getFilePath());
		model.addAttribute("list", zlList);
		
		return "particpants/ch_meet_upload_ck";
		
	}
}
