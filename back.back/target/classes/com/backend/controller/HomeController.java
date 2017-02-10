package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@Autowired
	
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("Iam from Controller");
		return "index";
	}
}
