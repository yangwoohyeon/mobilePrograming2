package com.example.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class Demo12Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo12Application.class, args);
	}

	@GetMapping(value = "/1") //home
	public String f1() {
		return "home";
	}

	@PostMapping(value = "param3")
	public String f2() {
		return "index";
	}


}
