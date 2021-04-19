package com.springmvcsignuplogin.services;

import com.springmvcsignuplogin.models.Login;
import com.springmvcsignuplogin.models.User;
	
public interface UserService {
	
	public void registration(User user);
	public User validateUser(Login login);
	
}
