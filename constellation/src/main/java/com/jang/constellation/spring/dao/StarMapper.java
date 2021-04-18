package com.jang.constellation.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.jang.constellation.spring.app.StarVo;
@Component
@Mapper
public interface StarMapper {
	 public List<StarVo> selectStar(String name) throws Exception;
}
