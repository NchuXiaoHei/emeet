package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Zl;

public interface UploadService {
   
	public int insert(Zl record);
	public List<Zl> ZlList(Long id);  //通过会议ID查询
}
