package com.xiaohei.service.impl;

import java.util.ArrayList;
import java.util.List;

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

	public List<Zl> ZlList(Long id) {
		// TODO Auto-generated method stub
		List<Zl> zlList = new ArrayList<Zl>();
		
		ZlExample zlExample = new ZlExample();
		ZlExample.Criteria criteria = zlExample.createCriteria();
		criteria.andIdEqualTo(Long.valueOf(id));
		zlList = zlMapper.selectByExampleWithBLOBs(zlExample);
		
		return zlList;
	}

}
