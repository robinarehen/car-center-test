package com.asesoftware.carcentertest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarCenterWebController {

	@RequestMapping(value = { "/", "/index" })
	public String getIndex() {

		return "index";
	}
	
	@RequestMapping("/login")
	public String getLogin(Model model) {

		return "login";
	}
	
	@RequestMapping("/logout")
	public String getLogout(Model model, HttpServletRequest request) {

		SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
		
		logoutHandler.logout(request, null, null);

		return "login";
	}
	
	@RequestMapping("/dashboard")
	public String getDashBoard(Model model) {

		return "dashboard";
	}
}
