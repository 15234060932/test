package com.chinasofti.springmvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Test {
	@RequestMapping("/test")
	public String hello(){
		System.out.println("hello world");
		return "success";
	}
}
