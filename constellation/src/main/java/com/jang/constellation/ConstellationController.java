package com.jang.constellation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ConstellationController {
	@RequestMapping(value="/")
	public String Constellation(){
		return "main";
	}
	@RequestMapping(value="/selectweather")
	public String SelectWeather() {
		return "selectweather";
	}

