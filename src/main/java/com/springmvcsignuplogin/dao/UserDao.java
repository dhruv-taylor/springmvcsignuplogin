package com.springmvcsignuplogin.dao;

import com.springmvcsignuplogin.models.Login;
import com.springmvcsignuplogin.models.User;

public interface UserDao {
	
	public void registration(User user);
	public User validateUser(Login login);
}	
