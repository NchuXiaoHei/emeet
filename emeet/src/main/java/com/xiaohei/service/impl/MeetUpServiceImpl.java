package com.xiaohei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.HyMapper;
import com.xiaohei.model.Hy;
import com.xiaohei.service.MeetUpService;

@Service("meetUpService")
public class MeetUpServiceImpl implements MeetUpService{
	@Autowired
	HyMapper hyMapper;

	public int insert(Hy record) {
		hyMapper.insert(record);
		return 1;
	}
	
}
