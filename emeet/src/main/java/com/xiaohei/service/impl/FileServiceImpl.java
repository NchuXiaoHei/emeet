package com.xiaohei.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xiaohei.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService{
	
	public int fileUpload(MultipartFile[] files, String path) throws IllegalStateException, IOException {
		for(MultipartFile file : files) {
			String fileName=file.getOriginalFilename();
			File dir = new File(path,fileName);
			if(!dir.exists()) {
				dir.mkdirs();
			}

			file.transferTo(dir);
		}
		return 0;
	}

	public void down(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String fileName = request.getSession().getServletContext().getRealPath("upload")+"/myfile.txt";
		InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
		String filename = "下载文件.txt";  
        //转码，免得文件名中文乱码  
        filename = URLEncoder.encode(filename,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("multipart/form-data");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
	}
}
