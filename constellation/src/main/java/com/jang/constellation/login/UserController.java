package com.jang.constellation.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
	private final UserService userService;
	@RequestMapping(value="/main")
	public String Main(){
		return "/login/main";
	}
	@RequestMapping(value="/login")
	public String Main_login(){
		
		return "/login/login";
	}
	@RequestMapping(value="/admin")
	public String Admin(){
		return "/login/admin";
	}
	@RequestMapping(value="/signup")
	public String Signup(){
		return "/login/signup";
	}
	@PostMapping("/user")
	public RedirectView signup( UserInfoDto infoDto) {
		//회원추가
		userService.save(infoDto);
		return new RedirectView("/login");
	}
  // 추가
	  @GetMapping(value = "/logout")
	  public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
	    new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
	    return "redirect:/login";
	  }
	@RequestMapping(value="/user_info")
	public String User_info(){
		return "/login/user_info";
	}	  
  
}
