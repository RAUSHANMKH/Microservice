package com.bluegem.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="MICROSERVICE1")
public interface MICROSERVICE_m1 {
	
	
	@GetMapping(value = "/m1/{name}")
	public String invokeService(@PathVariable("name") String name); 

}
