package com.xiaohei.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xiaohei.model.Tp;
import com.xiaohei.model.User;
import com.xiaohei.model.Zl;
import com.xiaohei.service.FileService;
import com.xiaohei.service.UploadService;


@Controller
public class UploadController {
	@Autowired
	UploadService uploadService;
	@Autowired
	FileService fileService;
	@RequestMapping("/addZl")
	public String addupload(Model model,HttpSession session,HttpServletRequest request,
			@RequestParam("zl_id") String zl_id,
	        @RequestParam("note") String note,
	        @RequestParam("files") MultipartFile[] files) throws ParseException, IllegalStateException, IOException{
		
		Zl zl =new Zl();
		User user = (User)session.getAttribute("user");
		zl.setZlId(Integer.valueOf(zl_id));
		zl.setId(Long.valueOf("2"));
		zl.setNote(String.valueOf(note));
		zl.setFilePath("resources/zl/"+files.toString());		

		if (uploadService.insert(zl) == 1) {
			//文件上传操作
			String path = request.getSession().getServletContext().getRealPath("WEB-INF/resources/zl");
			fileService.fileUpload(files, path);
			System.out.println("******"+11111);
			List<Zl> zlList = new ArrayList<Zl>();
			zlList = uploadService.ZlList(Long.valueOf("2"));		
			model.addAttribute("list", zlList);
			return "particpants/ch_meet_upload_ck";
		}
		
		return "../index";
		
	}
	@RequestMapping("/zlList")
	public String tp(Model model,HttpSession session) {
		
		List<Zl> zlList = new ArrayList<Zl>();
		zlList = uploadService.ZlList(Long.valueOf("2"));		
		model.addAttribute("list", zlList);
		
		return "particpants/ch_meet_upload_ck";
		
	}
}
