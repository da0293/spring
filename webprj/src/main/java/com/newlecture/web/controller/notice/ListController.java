package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


public class ListController implements Controller {

	// NoticeService를 인터페이스로 두면
	private NoticeService noticeService;

	// 의존성 주입을 위한 setter 메서드
	public void setService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ModelAndView 객체 생성, 해당 요청에 대한 응답을 구성하기 위해 사용
		ModelAndView mv = new ModelAndView("notice.list");
		
		// NoticeService를 사용하여 공지사항 목록을 가져옴
		List<Notice> list= noticeService.getList(1, "TITLE", "");
		
		// 가져온 목록을 ModelAndView 객체에 추가
		mv.addObject("list", list);
		
		// 구성된 ModelAndView 객체 반환
		return mv;
	}

}

