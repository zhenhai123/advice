package com.example.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class BusniessException {
	
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody //拦截返回的json格式
	public Map<String, Object> exceptionHandler(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("code", "700");
		map.put("msg", "亲，系统错误请稍后再试");
		
		return map;
		
	}

}
