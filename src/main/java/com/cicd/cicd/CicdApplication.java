package com.cicd.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {


	@GetMapping("/home")
	public String home(){
		return "Welcome Page";
	}


	@GetMapping("/how")
	public String how(){
		return "hello world this is a test case";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
