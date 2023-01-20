package com.example.demoAsmara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAsmaraApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoAsmaraApplication.class, args);
	}
@GetMapping
	public String hello(){
		return "Hello world";
}
}

