package com.hkdemircan.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	  @GetMapping
	    public String sayHello(){
	        return "hello jenkins test1";
	    }
}
