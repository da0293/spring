package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController") // 같은 NoticeController클래스가 있을 때 
@RequestMapping("/admin/board/notice/")
public class NoticeController { // <bean name="adminNoticeController class="com.newlecture.web.controller.admin.board.NoticeController">
	
	@RequestMapping("list")
	public String list() {
		return ""; 
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content) {
		return String.format("title:%s<br>content:%s<br>", title, content); 
	}
	
	@RequestMapping("edit")
	public String edit() {
		return ""; 
	}
	
	@RequestMapping("del")
	public String del() {
		return ""; 
	}
	

}
