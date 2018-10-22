package com.gntech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gntech.service.ResultService;

// 완료조회 컨트롤러
@Controller
public class ResultController {
	
	private ResultService resultService;
	
	@Autowired
	public ResultController(ResultService resultService) {
		super();
		this.resultService = resultService;
	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public ModelAndView ListResult() {
		System.out.println("ListResult 호출");
		return new ModelAndView("result", "list", resultService.ListResult());
	}

}
