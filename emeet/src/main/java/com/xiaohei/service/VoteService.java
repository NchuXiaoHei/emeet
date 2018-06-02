package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Tp;
import com.xiaohei.model.Tp_jl;

public interface VoteService {

	/*
	 * 参会人员
	 * 查看投票列表（管理员发起的）依据用户id
	 * 插入投票记录
	 * 查看投票记录（参会人员投票记录）依据投票id
	 * */
	public List<Tp> VoteList(Long id);
	
	public int insert(Tp_jl record);

	public List<Tp_jl> pxVoteList(Integer id); 
	
	public List<Tp_jl> hyVoteList(Long id);
		
	public List<Tp> notin_Tp(List<Integer> list);
	/*
	 * 主办方添加投票*/
	public int VoteInsert(Tp record);
	
	/*
	 * 删除投票*/
	public int VoteDelete(Long hy_id, Integer tp_id);
   
}
