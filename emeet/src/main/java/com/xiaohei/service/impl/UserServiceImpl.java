package com.xiaohei.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaohei.mapper.UserMapper;
import com.xiaohei.model.User;
import com.xiaohei.model.UserExample;
import com.xiaohei.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	public User loginValidate(String userId, String pwd) throws Exception {
	// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		
		criteria.andPwdEqualTo(pwd);
		criteria.andUserIdEqualTo(Long.valueOf(userId));
		users = userMapper.selectByExample(userExample);
		if(users.size() ==1)
			return users.get(0);
		return null;
	}
	
}
