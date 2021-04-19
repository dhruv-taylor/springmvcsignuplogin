package com.springmvcsignuplogin.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvcsignuplogin.dao.UserDao;
import com.springmvcsignuplogin.models.Login;
import com.springmvcsignuplogin.models.User;

public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	public void registration(User user) {
		userDao.registration(user);
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}
