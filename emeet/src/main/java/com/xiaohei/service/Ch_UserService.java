package com.xiaohei.service;

import java.util.List;

import com.xiaohei.model.Ch_Users;

public interface Ch_UserService {
	/*
	 * 添加参会人员*/
	public int insert(Ch_Users record);
	
	/*
	 * 获取当前的参会人员*/
	public List<Ch_Users> getList(Long hy_id);
}
