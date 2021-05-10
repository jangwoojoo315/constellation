package com.jang.constellation.signin.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jang.constellation.signin.dao.SigninMapper;
import com.jang.constellation.signin.domain.MemberVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SigninServiceImpl implements SigninService{
	@Autowired
	private SigninMapper signinMapper;
	BCryptPasswordEncoder passEncoder;
	
	public SigninServiceImpl(BCryptPasswordEncoder passEncoder) {
		this.passEncoder=passEncoder;
	}
	@Override
	public MemberVO signin(MemberVO vo) throws Exception {
		
		return signinMapper.signin(vo);
	}

	@Override
	public void signout(HttpSession session) throws Exception {
		session.invalidate();
		
	}

	@Override
	public String ValidateSignin(MemberVO vo,MemberVO login, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
//		 HttpSession session = req.getSession();
//		 boolean passMatch = passEncoder.matches(vo.getUserPass(), login.getUserPass());
//		 if(login != null && passMatch) {
//		  session.setAttribute("member", login);
//		 } else {
//		  session.setAttribute("member", null);
//		  rttr.addFlashAttribute("msg", false);
//		  return "redirect:/signin";
//		 }  
		 
		 return "redirect:/main_login";
	}

}
