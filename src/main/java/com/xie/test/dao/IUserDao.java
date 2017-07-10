package com.xie.test.dao;

import java.util.List;

import com.xie.test.vo.User;
public interface IUserDao {
	
	/**
	 * 查询全部人员
	 * @return
	 */
	List<User> queryUser();
}
