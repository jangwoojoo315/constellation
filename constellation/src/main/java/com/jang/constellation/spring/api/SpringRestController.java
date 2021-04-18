package com.jang.constellation.spring.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jang.constellation.spring.app.StarService;
import com.jang.constellation.spring.app.StarVo;

@RestController
public class SpringRestController {
    private final StarService starService;
    public SpringRestController(StarService starService) {
    	this.starService=starService;
    }
    @RequestMapping(value="/selectmemberlist/{name}")
    public List<StarVo> SelectMemberList(@PathVariable String name) throws Exception{
    	List<StarVo> list = starService.selectStar(name);
    	System.out.println(list);
    	return list;
    }
}
