package com.jang.constellation.spring.app;

import java.util.List;


public interface StarService {
	//public List<StarVo> selectStar(String logo_name) throws Exception;
	public List<StarVo> selectStar(String name) throws Exception;
}
