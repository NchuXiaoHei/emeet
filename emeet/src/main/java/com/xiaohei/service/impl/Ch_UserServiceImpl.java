package com.xiaohei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.Ch_UsersMapper;
import com.xiaohei.model.Ch_Users;
import com.xiaohei.model.Ch_UsersExample;
import com.xiaohei.model.User;
import com.xiaohei.service.Ch_UserService;

@Service("ch_UserService")
public class Ch_UserServiceImpl implements Ch_UserService{
	@Autowired
	Ch_UsersMapper ch_UsersMapper;
	
	public int insert(Ch_Users record) {
		// TODO Auto-generated method stub
		ch_UsersMapper.insert(record);
		return 0;
	}

	public List<Ch_Users> getList(Long hy_id) {
		// TODO Auto-generated method stub
		Ch_UsersExample ch_UsersExample = new Ch_UsersExample();
		Ch_UsersExample.Criteria criteria = ch_UsersExample.createCriteria();
		
		List<Ch_Users> ch_users = new ArrayList<Ch_Users>();
		
		criteria.andIdEqualTo(hy_id);
		ch_users= ch_UsersMapper.selectByExample(ch_UsersExample);
		return ch_users;
	}
	
}
