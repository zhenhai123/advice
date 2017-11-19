package com.example.advice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class indexController {
	
	
	@RequestMapping(value="/")
	public String index(){
		
		int a= 1/0;
		
		return "testException";
	}
	

}
