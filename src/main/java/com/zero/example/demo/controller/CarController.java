package com.zero.example.demo.controller;

import org.apache.log4j.Logger;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class CarController {

	Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping("/index")
	public String index(){
		logger.debug("lalala:{}");
		return "views/stock";
	}

	@RequestMapping("/detail")
	public String detail(String start, String end) {

	}
}
