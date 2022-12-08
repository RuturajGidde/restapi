package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String Sample()
	{
		String st1 = "ruturaj first deployment";
		System.out.println("Hey we are here");
		return "st1";
	}
}
