package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import auth.Check;

@Controller
public class HelloController {

	@RequestMapping("/test")
	public ModelAndView test(){
		String str = "hi,this is the spring,Tristan";
		return new ModelAndView("message","str",str);
	}

	@RequestMapping(value="/data",method=RequestMethod.POST)
	public String testGet(@RequestHeader(value="token") String token) {
		System.out.println(token);
        return "I got it";
	}
}
