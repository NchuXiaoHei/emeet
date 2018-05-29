package com.xiaohei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.ZlMapper;
import com.xiaohei.model.Zl;
import com.xiaohei.model.ZlExample;
import com.xiaohei.service.UploadService;
@Service("uploadService")
public class UploadServicelmpl implements UploadService{
	@Autowired
	ZlMapper zlMapper;
	
	public int insert(Zl record) {
		zlMapper.insert(record);
		return 1;
	}

}
