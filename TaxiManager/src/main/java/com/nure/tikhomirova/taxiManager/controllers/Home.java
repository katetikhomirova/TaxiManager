package com.nure.tikhomirova.taxiManager.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	private static final Logger logger = LoggerFactory.getLogger(Home.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		//test.doWork();
		return "home";
	}

	@RequestMapping(value = "/signin-failure", method = RequestMethod.GET)
	public String signInError(Model model) {
		model.addAttribute("error", "Sorry, that user doesn't exist!");
		return "home";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		model.addAttribute("error", "Sorry, that user doesn't exist!");
		return "home";
	}

}
