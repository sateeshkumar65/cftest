package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CftestController {
	
	@GetMapping("/greet/{name}") 
	public String elements (@PathVariable String name) {
		
		return "Hello " +name+"  from cloud Foundry";
		
	}
	
	@RequestMapping(value="/test/{name}", method = RequestMethod.GET)
	@GetMapping("/test/{name}")
	public String getRequestParamValues(@PathVariable(name="name")   String name, @RequestParam(name="value1")String value) {
		
		return "Hello"+name +value;	
	}

}
