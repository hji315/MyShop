package com.team.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.shop.service.MemberService;

@Controller
@RequestMapping(value = "/admin/*")
public class AdminController {

	//로그 기록을 남기기 위해서 Logger 클래스 인 logger 변수를 선언 (.getLogger("해당변수를 사용할 Controller 명".class);)
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private MemberService memberservice;
	
	//관리자 페이지 이동
	@RequestMapping(value = "/main", method=RequestMethod.GET)
	public void adminGET() {
		
		logger.info("관리자페이지 페이지 진입");
		
	}
	
	//회원 목록 보기 이동
	@RequestMapping(value = "/memberList", method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		
		logger.info("회원 목록 보기 페이지 진입");
		
		model.addAttribute("list", memberservice.list());
		
		return "admin/memberList";
	}
	
	
}
