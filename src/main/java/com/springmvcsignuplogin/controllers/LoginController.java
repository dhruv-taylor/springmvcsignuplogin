package com.springmvcsignuplogin.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcsignuplogin.models.Login;
import com.springmvcsignuplogin.models.User;
import com.springmvcsignuplogin.services.UserService;

@Controller
public class LoginController {

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new Login());
		return mv;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("login") Login login, HttpSession session) {
		ModelAndView mv = null;
		User user = userService.validateUser(login);

		if (user != null) {
			session.setAttribute("userId", user.getId());
			mv = new ModelAndView("welcome");
			mv.addObject("username", user.getUsername());
		} else {
			mv = new ModelAndView("login");
			mv.addObject("message", "Username or Password is wrong");
		}
		return mv;
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
