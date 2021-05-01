package com.jang.constellation.signin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SigninController {
	@RequestMapping(value="/signin")
	public String Signin(){
		return "/signin/signin";
	}
	@RequestMapping(value="/header")
	public String Header(){
		return "/common/header";
	}
	@RequestMapping(value="/nav")
	public String Nav(){
		return "/common/nav";
	}
	@RequestMapping(value="/footer")
	public String Footer(){
		return "/common/footer";
	}
}
