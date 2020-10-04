package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Demo1Application {

	@Autowired
	SingInRepository rep ;
	
	@RequestMapping("/test")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	
	@RequestMapping("/test3")
    @ResponseBody
    List<?> home3() {
      return rep.getSingInByUserName();
    }
	
	@RequestMapping("/")
    @ResponseBody
    String home2() {
      return "Hello World!2";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
