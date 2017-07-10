package com.xie.test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xie.test.dao.IUserDao;
import com.xie.test.service.UserService;
import com.xie.test.vo.User;

@Service
public class UserServcieImpl implements UserService{

	@Autowired
	public IUserDao userDao;
	
	public List<User> getUser() {
		List<User> user=userDao.queryUser();
		return user;
	}
}
