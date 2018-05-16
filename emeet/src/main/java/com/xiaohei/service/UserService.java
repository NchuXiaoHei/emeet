package com.xiaohei.service;

import com.xiaohei.model.User;

public interface UserService {
	/**
	 * 登录验证
	 */
	public User loginValidate(String userId,String pwd) throws Exception;
}
