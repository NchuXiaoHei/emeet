package com.xiaohei.controller;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		System.out.println("111111");
		Zl zl =new Zl();
		User user = (User)session.getAttribute("user");
		zl.setZlId(Integer.valueOf(zl_id));
		zl.setId(Long.valueOf("2"));
		zl.setNote(String.valueOf(note));
		zl.setFilePath(String.valueOf(file_path));
		
		if(uploadService.insert(zl)==1) {
			System.out.println("111111");
			return "xxx";
			
		}
		return "../index";
		
	}
}
