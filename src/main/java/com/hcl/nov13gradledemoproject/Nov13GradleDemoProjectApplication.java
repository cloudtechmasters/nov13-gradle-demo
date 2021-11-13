package com.hcl.nov13gradledemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class Nov13GradleDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nov13GradleDemoProjectApplication.class, args);
	}
	
	 @GetMapping("/hello")
    public String helloapi(){
                return "this project is gradle project";
    }

}
