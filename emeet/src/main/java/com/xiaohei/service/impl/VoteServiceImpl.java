package com.xiaohei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.TpMapper;
import com.xiaohei.mapper.Tp_jlMapper;

import com.xiaohei.model.Tp;
import com.xiaohei.model.TpExample;
import com.xiaohei.model.Tp_jl;
import com.xiaohei.model.Tp_jlExample;

import com.xiaohei.service.VoteService;

@Service("voteService")
public class VoteServiceImpl implements VoteService{
	@Autowired
	TpMapper tpMapper;
	@Autowired
	Tp_jlMapper tp_jlmapper;
	
	public List<Tp> VoteList(Long id) {
		List<Tp> tpList= new ArrayList<Tp>();
		
		TpExample tpExample = new TpExample();
		TpExample.Criteria criteria = tpExample.createCriteria();
		
		criteria.andIdEqualTo(Long.valueOf(id));
		tpList = tpMapper.selectByExample(tpExample);
		
		System.out.println(tpList.get(0).getId());
		
		return tpList;
	}

	public int insert(Tp_jl record) {
		// TODO Auto-generated method stub
		tp_jlmapper.insert(record);
		return 1;
	}

	public List<Tp_jl> pxVoteList(Integer id) {
		// TODO Auto-generated method stub
		List<Tp_jl> px_tpList = new ArrayList<Tp_jl>();
		Tp_jlExample tp_jlExample = new Tp_jlExample();
		Tp_jlExample.Criteria criteria = tp_jlExample.createCriteria();
		criteria.andTpIdEqualTo(Integer.valueOf(id));
		px_tpList = tp_jlmapper.selectByExample(tp_jlExample);
		
		return px_tpList;
	}

	public List<Tp> notin_Tp(List<Integer> list) {
		// TODO Auto-generated method stub		
		List<Tp> notin_List = new ArrayList<Tp>();
		TpExample tpExample = new TpExample();
		TpExample.Criteria criteria = tpExample.createCriteria();
		criteria.andTpIdNotIn(list);
		notin_List = tpMapper.selectByExample(tpExample);
		return notin_List;
	}
	
	public int VoteInsert(Tp record) {
		// TODO Auto-generated method stub
		tpMapper.insert(record);
		return 0;
	}

	public int VoteDelete(Long hy_id, Integer tp_id) {
		// TODO Auto-generated method stub
		tpMapper.deleteByPrimaryKey(hy_id, tp_id);
		return 0;
	}

	public List<Tp_jl> hyVoteList(Long userid) {
		// TODO Auto-generated method stub
		List<Tp_jl> hytpList = new ArrayList<Tp_jl>();
		Tp_jlExample tp_jlExample = new Tp_jlExample();
		Tp_jlExample.Criteria criteria = tp_jlExample.createCriteria();
		criteria.andUserIdEqualTo(userid);
		hytpList = tp_jlmapper.selectByExample(tp_jlExample);
		return hytpList;
	}

	
	
}
