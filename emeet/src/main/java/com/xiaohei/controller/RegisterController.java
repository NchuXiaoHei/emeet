package com.xiaohei.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xiaohei.service.RegisterService;
import com.xiaohei.service.ZxingDecoderService;
import com.xiaohei.model.RegisterCode;
@Controller
public class RegisterController {
	@Autowired
	RegisterService registerService;
	@Autowired
	ZxingDecoderService zxingDecoderService;
    

    @RequestMapping("/zxingdecode")
    public String zxingdecode(Model model,@RequestParam("realImgPath") String realImgPath, HttpSession session) {
        String uploadPath = "/images" ;
        String realUploadPath = session.getServletContext().getRealPath(uploadPath) ;
        String imgPath = realUploadPath+"/"+realImgPath ;
        String result = zxingDecoderService.zxingdecode(imgPath) ;
        
        ModelAndView ret = new ModelAndView() ;
        ret.addObject("result", result) ;
        ret.setViewName("zxingdecode");
        
        model.addAttribute("list",ret);
        
        return "particpants/ch_meet_register" ;
    }

    @RequestMapping("/zxingcoder")
    public String watermark(ModelMap model,HttpSession session) throws Exception {
        String uploadPath = "../jsps/resources/img" ;
        String realUploadPath = session.getServletContext().getRealPath(uploadPath) ;
        String imageName = "2"+".jpg" ;
        // 模拟订单详情
        String contents = "订单编号：20160512082345"+"\n"+"订单金额：￥ 2050.00"+"\n"+"支付方式：预存款"+"\n"+"配送方式：京东快递" ;  
        int width = 300;  
        int height = 300; 
        String zxingImage = registerService.encode(contents, width, height, uploadPath, realUploadPath, imageName);  
        File image = new File(realUploadPath+"/"+imageName); 
        ModelAndView ret = new ModelAndView() ;
        ret.addObject("imageUrl", zxingImage) ;
        ret.addObject("imageName", imageName) ;       
        ret.setViewName("zxingcoder");
        model.addAttribute("list",ret);
        
        return "particpants/ch_meet_register" ;
    }

	 
}
