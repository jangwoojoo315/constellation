package com.jang.constellation.spring.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jang.constellation.spring.dao.StarMapper;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class StarServiceImpl implements StarService{
	@Autowired
	private StarMapper starMapper;
	@Override
	@Transactional
	public List<StarVo> selectStar(String name) throws Exception {
		System.out.println("serviceimpl");
		return starMapper.selectStar(name);
	}
	
}
