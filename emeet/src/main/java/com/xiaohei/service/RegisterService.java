package com.xiaohei.service;

import java.io.File;

public interface RegisterService {
	
	 public String encode(String contents, int width, int height, String uploadPath, String realUploadPath, String imageName);
	 public String LogoMatrix(File image, String uploadPath, String realUploadPath, String imgPath);
}
