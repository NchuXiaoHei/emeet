package com.xiaohei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohei.mapper.HyMapper;
import com.xiaohei.model.Hy;
import com.xiaohei.service.MeetService;

public class MeetServiceImpl implements MeetService{
	
	@Autowired
	HyMapper hyMapper;
	
	public Hy getHyById(Long id) {
		// TODO Auto-generated method stub
		return hyMapper.selectByPrimaryKey(id);
	}
	
}
