package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 콘솔에 "index controller" 출력
		System.out.println("index controller");
		
		// ModelAndView 객체 생성
		ModelAndView mv = new ModelAndView();
		
		// "data"라는 키와 "Hello Spring MVC"라는 값을 추가
		mv.addObject("data", "Hello Spring MVC");
		
		// 뷰 이름을 "index.jsp"로 설정
		mv.setViewName("WEB-INF/view/index.jsp");
		
		// ModelAndView 객체 반환
		return mv;
	}	
}

