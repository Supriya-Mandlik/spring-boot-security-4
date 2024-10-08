package com.code.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Role Based Authorization

@RestController
public class GreetingsController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userEndPoint() {
		return "Hello, User!";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String adminEndPoint() {
		return "Hello, Admin!";
	}

}