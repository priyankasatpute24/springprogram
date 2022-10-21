package com.example.springprogram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloController {

	 @RequestMapping("/")

	 public String helloworld() {
		 return "Hello World";
	 }
	 @GetMapping("/Hello")
	 public String display() {
		 return "Hello Priyanka";
	 }
}
