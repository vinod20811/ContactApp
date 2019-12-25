package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterPageController {
	
	@RequestMapping("/registerPage")
	public String getRegisterPage()
	{
		return "register";
	}

}
