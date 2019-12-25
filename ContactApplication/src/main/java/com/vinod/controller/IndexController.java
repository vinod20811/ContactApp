package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping({"/"})
	public String getIndexPage()
	{
		System.out.println("Home page is calling");
		return "home";
	}
}
