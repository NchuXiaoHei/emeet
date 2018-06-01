package com.xiaohei.controller;

import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xiaohei.model.Hy;
import com.xiaohei.model.User;
import com.xiaohei.service.FileService;
import com.xiaohei.service.MeetUpService;

@Controller
public class MeetUpController {
	@Autowired
	MeetUpService meetUpService;
	@Autowired
	FileService fileService;

	@RequestMapping("/meetUp")
	public String meetUp(@RequestParam("files") MultipartFile[] files, Model model, HttpSession session, 
			HttpServletRequest request,
			@RequestParam("theme") String theme,
			@RequestParam("s_time") String s_time, @RequestParam("e_time") String e_time,
			@RequestParam("pirture1") String pirture1, @RequestParam("pirture2") String pirture2)
			throws ParseException, IllegalStateException, IOException {
		System.out.println(pirture1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		date = formatter.parse(s_time);
		Hy hy = new Hy();
		User user = (User) session.getAttribute("user");
		hy.setId(Long.valueOf("3"));
		hy.setName(String.valueOf(user.getName()));
		//hy.setName(String.valueOf("南昌航空大学"));
		hy.setsTime(date);
		date = formatter.parse(e_time);
		hy.seteTime(date);
		hy.setStatus("待审核");
		String[] pirture1s = pirture1.split("/");
		pirture1 = pirture1s[pirture1s.length - 1];
		String[] pirture2s = pirture2.split("/");
		pirture2 = pirture2s[pirture2s.length - 1];
		hy.setPirture1("resources/pirture1/" + pirture1);
		hy.setPirture2("resources/pirture2/" + pirture2);
		hy.setTheme(theme);
		if (meetUpService.insert(hy) == 1) {
			//文件上传操作
			String path = request.getSession().getServletContext().getRealPath("/resources/pirture1");
			fileService.fileUpload(files, path);
			model.addAttribute("hy_id",hy.getId());
			return "meet";
		}
		return "../index";

	}
}
