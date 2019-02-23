package com.springMVC.service;

import org.springframework.stereotype.Service;

@Service
public class ReadMeService {

	public String readMe() {
		return "There are 3 layers in web application"
				+ "1) Presentation Layer"
				+ "2) Application Layer"
				+ "3) Data Layer";
	}
}
