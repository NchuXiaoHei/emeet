package com.xiaohei.service;

import com.xiaohei.model.Hy;

public interface MeetStatusService {
	/*
	 * 修改会议状态*/
	public int updateHyStatus(Hy record, String status);
}
