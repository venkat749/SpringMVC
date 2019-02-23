package com.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.service.ReadMeService;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	@Autowired
	public ReadMeService readMeService;
	
//	This request send the message to jsp which is hard coded as "Welcome to the world of Spring MVC"
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView("welcomePage","welcomeMessage","Welcome to the world of Spring MVC");
		return model;
		
	}
	
//	Here we get a data from a service layer (ie) readMeService
	@RequestMapping(value="/readMe", method=RequestMethod.GET)
	public ModelAndView readME() {
		ModelAndView model = new ModelAndView("welcomePage","welcomeMessage",readMeService.readMe());
		return model;
	}
}
