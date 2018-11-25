package com.zero.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

	@RequestMapping("/display")
	public String index(){
		
		return "views/stock";
	}
}
