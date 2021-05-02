package com.jang.constellation.signup.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jang.constellation.signin.domain.MemberVO;
import com.jang.constellation.signup.dao.SignupMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService{
	@Autowired
	private SignupMapper signupMapper;
	BCryptPasswordEncoder passEncoder;
	public SignupServiceImpl(BCryptPasswordEncoder passEncoder) {
		this.passEncoder=passEncoder;
	}
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		 String inputPass = vo.getUserPass();
		 
		 String pass = passEncoder.encode(inputPass);
		 System.out.println(pass);
		 vo.setUserPass(pass);
		signupMapper.signup(vo);
	}
	
}
