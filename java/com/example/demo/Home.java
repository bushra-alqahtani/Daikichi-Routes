package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	
	@RequestMapping("/")
	public String hello() {
		return "hello from the controller ";
	}
	@RequestMapping(value="/user/{username}",method=RequestMethod.GET)
	public String greating(@PathVariable("username") String username) {
		return " Salam "+username;
	}
	

	@RequestMapping("/request-param")
	public String index(@RequestParam(value="q") String searchQuery) {
		return " You searched for "+searchQuery;
	}
}
