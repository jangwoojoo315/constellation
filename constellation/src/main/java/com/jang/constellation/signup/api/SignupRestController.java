package com.jang.constellation.signup.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jang.constellation.signin.domain.MemberVO;
import com.jang.constellation.signup.app.SignupService;

@RestController
public class SignupRestController {
	private static final Logger Logger=LoggerFactory.getLogger(SignupRestController.class);
    private final SignupService signupService;
    public SignupRestController(SignupService signupService) {
    	this.signupService=signupService;
    }
	//@Autowired
	//BCryptPasswordEncoder passEncoder;
	  
	// 회원 가입 get
	@RequestMapping(value = "/signup_info", method = RequestMethod.GET)
	public void getSignup() throws Exception {
		Logger.info("get signup");
	}

	// 회원 가입 post
	@RequestMapping(value = "/signup_info", method = RequestMethod.POST)
	public String postSignup(@RequestBody MemberVO vo) throws Exception {
		Logger.info("post signup");
		System.out.println(vo);
	 signupService.signup(vo);

	 return "redirect:/";
	}
}
