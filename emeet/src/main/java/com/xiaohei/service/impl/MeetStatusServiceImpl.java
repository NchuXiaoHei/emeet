package com.xiaohei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.HyMapper;
import com.xiaohei.model.Hy;
import com.xiaohei.service.MeetStatusService;

@Service("meetStatusService")
public class MeetStatusServiceImpl implements MeetStatusService{
	@Autowired
	HyMapper hyMapper;
	
	/*
	 * 修改会议状态*/
	public int updateHyStatus(Hy record, String status) {
		record.setStatus(status);
		hyMapper.updateByPrimaryKey(record);
		return 0;
	}

}
