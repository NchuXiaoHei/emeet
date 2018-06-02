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

@Controller
public class RegisterController {
	@Autowired
	RegisterService registerService;
	@Autowired
	ZxingDecoderService zxingDecoderService;
	

    @RequestMapping("/zxingdecode")
    public String zxingdecode(ModelAndView model,@RequestParam("realImgPath") String realImgPath, HttpSession session) {
        String uploadPath = "/images" ;
        String realUploadPath = session.getServletContext().getRealPath(uploadPath) ;
        String imgPath = realUploadPath+"/"+realImgPath ;
        String result = zxingDecoderService.zxingdecode(imgPath) ;
        
        ModelAndView ret = new ModelAndView() ;
        ret.addObject("result", result) ;
        ret.setViewName("zxingdecode");
        model.addObject("list",ret);
       
        
        return "particpants/ch_meet_register" ;
    }

    @RequestMapping("/zxingcoder")
    public String watermark(ModelAndView model,HttpSession session) throws Exception {
        String uploadPath = "WEB-INF/resources/img" ;
        String realUploadPath = session.getServletContext().getRealPath(uploadPath) ;
        String imageName = "2"+".jpg" ;
        String contents = "姓名：李梓洋"+"\n"+"UsreId：15201208"+"\n"+"状态：签到成功" ;  
        int width = 300;  
        int height = 300; 
        String zxingImage = registerService.encode(contents, width, height, uploadPath, realUploadPath, imageName);  
        File image = new File(realUploadPath+"/"+imageName); 
        String logoImageUrl = registerService.LogoMatrix(image, uploadPath, realUploadPath, imageName) ;
        ModelAndView ret = new ModelAndView() ;
        ret.addObject("imageUrl", zxingImage) ;
        ret.addObject("imageName", imageName) ;
        ret.addObject("logoImageUrl", logoImageUrl) ;
        ret.setViewName("zxingcoder");  
               
        model.addObject("imageUrl", zxingImage);
        
        return "particpants/ch_meet_register" ;
    }

	 
}
