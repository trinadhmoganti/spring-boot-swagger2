package com.java.learning.springbootswagger2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "Spring Boot Swagger2 application..!";
	}

}
