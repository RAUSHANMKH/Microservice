package com.bluegem.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bluegem.client.MICROSERVICE_m1;


@RestController
public class Microservice2_Class {
	
	@Autowired
	private  MICROSERVICE_m1 m1;
	@GetMapping(value = "/m2/{name}")
	public String sayM2(@PathVariable("name") String name) {
		String hiMsg="m2";
		String helloMsg=m1.invokeService(name);
		return hiMsg+ "   "+ helloMsg;
	}

}
