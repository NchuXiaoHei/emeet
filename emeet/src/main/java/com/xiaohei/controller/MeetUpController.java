package com.xiaohei.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Hy;
import com.xiaohei.model.User;
import com.xiaohei.service.MeetUpService;

@Controller
public class MeetUpController {
	@Autowired
	MeetUpService meetUpService;
	
	@RequestMapping("/meetUp")
	public String meetUp(Model model,HttpSession session,
			@RequestParam("theme") String theme,
			@RequestParam("s_time") String s_time,
			@RequestParam("e_time") String e_time,
			@RequestParam("pirture1") String pirture1,
			@RequestParam("pirture2") String pirture2) throws ParseException {
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = null;
			date=formatter.parse(s_time);
			Hy hy = new Hy();
			User user = (User)session.getAttribute("user");
			hy.setId(Long.valueOf("1"));
			hy.setName(String.valueOf(user.getUserId()));
			hy.setsTime(date);
			date = formatter.parse(e_time);
			hy.seteTime(date);
			hy.setStatus("待审核");
			String[] pirture1s = pirture1.split("/");
			pirture1 = pirture1s[pirture1s.length-1];
			String[] pirture2s = pirture2.split("/");
			pirture2 = pirture2s[pirture2s.length-1];
			hy.setPirture1("resources/pirture1/"+pirture1);
			hy.setPirture2("resources/pirture2/"+pirture2);
			hy.setTheme(theme);
			if(meetUpService.insert(hy)==1) {
				return "test";
			}
			return "../index";
		
	}
}
