package com.xiaohei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.LcMapper;
import com.xiaohei.model.Lc;
import com.xiaohei.model.LcExample;
import com.xiaohei.service.LcService;

@Service("LcServic")
public class LcServiceImpl implements LcService{

	@Autowired
	LcMapper lcMapper;
	
	public List<Lc> getLcList(Long hy_id) {
		// TODO Auto-generated method stub
		LcExample example = new LcExample();
		LcExample.Criteria criteria = example.createCriteria();
		
		criteria.andIdEqualTo(hy_id);
		return lcMapper.selectByExample(example);
	}

	public int updateLc(Lc record) {
		// TODO Auto-generated method stub
		lcMapper.updateByPrimaryKey(record);
		return 0;
	}

	public int insertLc(Lc record) {
		// TODO Auto-generated method stub
		lcMapper.insert(record);
		return 0;
	}

	public int deleteLcs(Long hy_id) {
		// TODO Auto-generated method stub
		LcExample example = new LcExample();
		LcExample.Criteria criteria = example.createCriteria();
		
		criteria.andIdEqualTo(hy_id);
		lcMapper.deleteByExample(example);
		return 0;
	}

	public int deleteLc(Long hy_id, Integer num) {
		// TODO Auto-generated method stub
		lcMapper.deleteByPrimaryKey(num, hy_id);
		return 0;
	}

}
