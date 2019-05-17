package com.cts.employeemicroservices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/employee")
@Api(value="EmployeeControllerAPI", produces=MediaType.APPLICATION_JSON_VALUE)
public class EmployeeMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroservicesApplication.class, args);
	}
    
	@GetMapping("/greet")
	@ApiOperation("Greet the Employees")
	@ApiResponses(value={@ApiResponse(code=200,message="OK",response=String.class)})
	public String greetEmployee(){
		return "Welcome Employee";
	}
	//fetch all employees
}
