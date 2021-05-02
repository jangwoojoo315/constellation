package com.jang.constellation.signup.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.jang.constellation.signin.domain.MemberVO;

@Component
@Mapper
public interface SignupMapper {
	public void signup(MemberVO vo) throws Exception;
}
