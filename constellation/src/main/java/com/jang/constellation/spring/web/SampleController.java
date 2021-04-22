package com.jang.constellation.spring.web;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jang.constellation.spring.app.StarService;
import com.jang.constellation.spring.app.StarVo;
import com.jang.constellation.spring.dao.StarMapper;

import lombok.RequiredArgsConstructor;

@Controller

public class SampleController {
    
	@RequestMapping(value="/")
	public String Constellation(){
		return "main";
	}
	@RequestMapping(value="/selectweather")
	public String SelectWeather() {
		return "selectweather";
	}
	@RequestMapping(value="/spring_constellation")
	public String Spring_constellation() {
		return "spring_constellation";
	}
	@RequestMapping(value="/summer_constellation")
	public String Summer_constellation() {
		return "summer_constellation";
	}
	@RequestMapping(value="/fall_constellation")
	public String Fall_constellation() {
		return "fall_constellation";
	}
}
	