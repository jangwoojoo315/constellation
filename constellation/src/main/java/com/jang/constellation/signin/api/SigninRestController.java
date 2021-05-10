package com.jang.constellation.signin.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jang.constellation.signin.app.SigninService;
import com.jang.constellation.signin.domain.MemberVO;
import com.jang.constellation.signup.api.SignupRestController;

@RestController
public class SigninRestController {
	private static final Logger Logger=LoggerFactory.getLogger(SignupRestController.class);
    private final SigninService signinService;	
    public SigninRestController(SigninService signinService) {
    	this.signinService=signinService;
    }
	// 로그인  get
	@RequestMapping(value = "/signin_info", method = RequestMethod.GET)
	public void getSignin() throws Exception {
		Logger.info("get signin");
	}

	// 로그인 post
	@RequestMapping(value = "/signin_info", method = RequestMethod.POST)
	public String postSignin(@RequestBody MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		Logger.info("post signin");
		 MemberVO login = signinService.signin(vo);  
		 
		 String validation_result=signinService.ValidateSignin(vo, login,req,rttr);
		 System.out.println(validation_result);
		 return validation_result;
	}
	  
	// 로그아웃
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signout(HttpSession session) throws Exception {
		Logger.info("get logout");
	 
		signinService.signout(session);
	   
	 return "redirect:/";
	}
}
