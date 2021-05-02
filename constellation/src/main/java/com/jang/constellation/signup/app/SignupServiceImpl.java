package com.jang.constellation.signup.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jang.constellation.signin.domain.MemberVO;
import com.jang.constellation.signup.dao.SignupMapper;
import com.jang.constellation.spring.dao.StarMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService{
	@Autowired
	private SignupMapper signupMapper;
	@Override
	public void signup(MemberVO vo) throws Exception {
		signupMapper.signup(vo);
	}
	
}
