package com.xiaohei.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/*
 * 文件上传和下载*/
public interface FileService {
	/*
	 * 文件上传*/
	public int fileUpload(MultipartFile[] files, String path) throws IllegalStateException, IOException;
	/*
	 * 文件下载*/
	
}
