package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Tp;
import com.xiaohei.model.Tp_jl;

public interface VoteService {

	/*
	 * 查看投票列表
	 * */
	public List<Tp> VoteList(String id);
	public int insert(Tp_jl record);
	public List<Tp_jl> pxVoteList(String id);
}
