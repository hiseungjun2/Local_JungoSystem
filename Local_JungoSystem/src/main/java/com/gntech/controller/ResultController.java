package com.gntech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// 완료조회 컨트롤러
@Controller
public class ResultController {
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public ModelAndView ListResult() {
		System.out.println("ListResult 호출");
		return new ModelAndView("result");
	}

}
