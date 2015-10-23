package com.nure.tikhomirova.taxiManager.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Profile {

	// private static final Logger logger =
	// LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/profile/{login}", method = RequestMethod.GET)
	public String signUp(@PathVariable("login") String login, Model model) {
		model.addAttribute("login", login);
		return "profile";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String signUp() {
		return "profile";
	}


}