package com.xiaohei.service;

import com.xiaohei.model.Hy;

public interface MeetUpService {
	/*
	 * 向数据库添加一条会议记录
	 * */
	public int insert(Hy record);
}
