package com.jang.constellation.signin.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jang.constellation.signin.domain.MemberVO;

public interface SigninService {
	//로그인
	public MemberVO signin(MemberVO vo) throws Exception;
	//로그인 비밀번호 검증
	public String ValidateSignin(MemberVO vo,MemberVO login, HttpServletRequest req, RedirectAttributes rttr)throws Exception;
	//로그아웃
	public void signout(HttpSession session)throws Exception;
}
