package com.springbootapp.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@RequestMapping( value = "/hello",method = RequestMethod.GET)
	public String display() {
		return "Hi...from springboot";

	}
	@RequestMapping( value = "/hi/{name}",method = RequestMethod.GET)
	public String show(@PathVariable String name) {
		return "Hi ..."+name;
}
}