package com.bluegem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudM1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudM1Application.class, args);
	}

}
