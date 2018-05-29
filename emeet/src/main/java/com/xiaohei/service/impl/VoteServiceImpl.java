package com.xiaohei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.TpMapper;
import com.xiaohei.model.Tp;
import com.xiaohei.model.TpExample;
import com.xiaohei.service.VoteService;

@Service("voteService")
public class VoteServiceImpl implements VoteService{
	@Autowired
	TpMapper tpMapper;
	
	public List<Tp> VoteList(String id) {
		List<Tp> tpList= new ArrayList<Tp>();
		
		TpExample tpExample = new TpExample();
		TpExample.Criteria criteria = tpExample.createCriteria();
		
		criteria.andIdEqualTo(Long.valueOf(id));
		tpList = tpMapper.selectByExample(tpExample);
		
		System.out.println(tpList.get(0).getId());
		
		return tpList;
	}
	
}
