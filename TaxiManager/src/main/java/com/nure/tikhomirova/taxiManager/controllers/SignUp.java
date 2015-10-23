package com.nure.tikhomirova.taxiManager.controllers;


import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SignUp {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) {		
		return "signUp";
	}
	
}