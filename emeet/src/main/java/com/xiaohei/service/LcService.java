package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Lc;

public interface LcService {
	/*
	 * 查看当前会议的流程*/
	public List<Lc> getLcList(Long hy_id);
	
	/*
	 *添加一个流程 */
	public int insertLc(Lc record);
	
	/*
	 * 修改会议流程的顺序*/
	public int updateLc(Lc record);
	
	/*
	 * 删除某个会议的所有流程，以更新流程*/
	public int deleteLcs(Long hy_id);
	
	/*
	 * 删除会议的某个流程*/
	public int deleteLc(Long hy_id, Integer num);
}
