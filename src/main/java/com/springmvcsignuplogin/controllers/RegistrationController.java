package com.springmvcsignuplogin.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcsignuplogin.models.User;
import com.springmvcsignuplogin.services.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	public UserService userService; 
	
	@RequestMapping(value= "/register", method=RequestMethod.GET)
	public ModelAndView showRegister()
	{
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("user", new User());
		return mv;
	}
	
	@RequestMapping(value= "/registerProcess", method=RequestMethod.POST)
	public ModelAndView registerProcess(@ModelAttribute("user") User user, HttpServletRequest request, HttpServletResponse response)
	{
		userService.registration(user);
		return new ModelAndView("welcome", "username", user.getFirstname());
	}
	
}
