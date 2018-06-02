package com.xiaohei.controller;

import java.io.InputStream;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xiaohei.model.Lc;
import com.xiaohei.service.LcService;

@Controller
public class LcController {
	@Autowired
	LcService lcService;
	
	@RequestMapping("/getLc")
	public String getLc(Model model,@RequestParam("hy_id") String hy_id) {
		model.addAttribute("lcList", lcService.getLcList(Long.valueOf(hy_id)));
		return "ower/lc";
	}
	
	@RequestMapping("/addLc")
	public String addLc(Model model,@RequestParam("hy_id") String hy_id,
			@RequestParam("num") String num,
			@RequestParam("note") String note,
			@RequestParam("s_time") String s_time,
			@RequestParam("e_time") String e_time) throws ParseException {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = null;
		time=formatter.parse(s_time);
		
		Lc lc = new Lc();
		lc.setId(Long.valueOf(hy_id));
		lc.setNum(Integer.valueOf(num));
		lc.setNote(note);
		lc.setsTime(time);
		time=formatter.parse(e_time);
		lc.seteTime(time);
		lcService.insertLc(lc);
		
		model.addAttribute("lcList", lcService.getLcList(Long.valueOf(hy_id)));
		return "ower/lc";
	}
	
	@RequestMapping("updateLc")
	public String updateLc(Model model, HttpServletRequest request, @RequestParam("length") String length,
			@RequestParam("hy_id") String hy_id) throws ParseException {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		lcService.deleteLcs(Long.valueOf(hy_id));
		//前台使用EL表达式动态生成表单的input标签，命名为name+i,i为lcList中对象的坐标
		for(int i =0;i<Integer.valueOf(length);i++) {
			Lc lc = new Lc();
			lc.setId(Long.valueOf(hy_id));
			lc.setNum(Integer.valueOf(request.getParameter("num"+String.valueOf(i))));
			lc.setNote(request.getParameter("note"+String.valueOf(i)));
			lc.setsTime(formatter.parse(request.getParameter("s_time"+String.valueOf(i))));
			lc.seteTime(formatter.parse(request.getParameter("e_time"+String.valueOf(i))));
			lcService.insertLc(lc);
		}
		
		model.addAttribute("lcList", lcService.getLcList(Long.valueOf(hy_id)));
		return "ower/lc";
	}
	
	@RequestMapping("deleteLc")
	public String deleteLc(Model model,@RequestParam("hy_id") String hy_id,
			@RequestParam("num") String num) {
		lcService.deleteLc(Long.valueOf(hy_id), Integer.valueOf(num));
		model.addAttribute("lcList", lcService.getLcList(Long.valueOf(hy_id)));
		return "ower/lc";
	}
}
