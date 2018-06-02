package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Zl;

public interface UploadService {
   
	public int insert(Zl record);    //插入数据
	
	public List<Zl> ZlList(Long id); //以会议id查询
}
