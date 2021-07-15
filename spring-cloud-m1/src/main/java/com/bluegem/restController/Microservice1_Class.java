package com.bluegem.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice1_Class {
	
	@GetMapping(value = "/m1/{name}")
	public String sayM1(@PathVariable("name") String name) {
		String msg="m1"+name+"how are u";
	
		return msg;
		
	}

}
