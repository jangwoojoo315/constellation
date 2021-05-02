package com.jang.constellation.signup.app;

import com.jang.constellation.signin.domain.MemberVO;

public interface SignupService {
	public void signup(MemberVO vo) throws Exception;
}
