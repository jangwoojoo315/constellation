package com.jang.constellation.signup.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {
	@RequestMapping(value="/signup")
	public String Signin(){
		return "/signup/signup";
	}
}
