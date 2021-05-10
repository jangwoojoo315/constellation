package com.jang.constellation.signin.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.jang.constellation.signin.domain.MemberVO;

@Component
@Mapper
public interface SigninMapper {
	public MemberVO signin(MemberVO vo) throws Exception;
}
