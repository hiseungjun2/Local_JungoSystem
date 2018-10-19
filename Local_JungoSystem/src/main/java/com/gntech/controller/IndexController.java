package com.gntech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gntech.service.IndexService;

@Controller
public class IndexController {
	
	private IndexService indexService;
	
	// 자동으로 검색
	@Autowired
	public IndexController(IndexService indexService) {
		super();
		this.indexService = indexService;
	}

	// 신청조회 화면(메인)
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView ListIndex() {
		System.out.println("ListIndex 호출");
		return new ModelAndView("index", "list", indexService.ListIndex());
	}
	
	// 신청내역 상세조회
	@RequestMapping(value="/indexInfo", method = RequestMethod.GET)
	public ModelAndView SelectIndex(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("SelectIndex 호출");
		return new ModelAndView("index_info", "select", indexService.SelectIndex(id));
	}
	
}
