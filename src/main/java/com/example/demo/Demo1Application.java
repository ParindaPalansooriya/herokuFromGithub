package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Demo1Application {

	
	@RequestMapping("/test")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	
	@RequestMapping("/test2")
    @ResponseBody
    String home2() {
      return "Hello World!2";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
