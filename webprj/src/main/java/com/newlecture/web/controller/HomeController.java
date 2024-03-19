package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("index")
	public String index() {
		// 뷰 페이지를 만들기 위해 문자열로 return 
		return "root.index";
	}
}

