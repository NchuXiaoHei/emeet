package com.xiaohei.service.impl;

import java.io.File;
import java.io.IOException;

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
}
