package com.xie.test.service;

import java.util.List;
import java.util.Map;

import com.xie.test.vo.User;

public interface UserService {
	
	/**
	 * 获取全部用户
	 * @return
	 */
	public List<User> getUser();
}
