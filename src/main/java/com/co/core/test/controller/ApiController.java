package com.co.core.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping(value="/demo")
	public String demo() {
		return "Welcome to JWT";
	}
}
