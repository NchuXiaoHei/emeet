package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Tp;

public interface VoteService {

	/*
	 * 查看投票列表
	 * */
	public List<Tp> VoteList(String id);
}
