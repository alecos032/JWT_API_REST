package com.co.core.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.core.test.modelo.ResponseObject;

@RestController
public class ApiController {

	@GetMapping(value="/demo")
	public ResponseObject demo() {
		ResponseObject response= new ResponseObject(HttpStatus.OK.toString(),"Welcome to Login with JWT");
		return response;
	}
}
