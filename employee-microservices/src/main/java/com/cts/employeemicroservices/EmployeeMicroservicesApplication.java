package com.cts.employeemicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EmployeeMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroservicesApplication.class, args);
	}
    
	@RequestMapping
	public String helloEmployee(){
		return "Welcome Employee";
	}
}
