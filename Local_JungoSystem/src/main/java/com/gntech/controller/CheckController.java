package com.gntech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// 검토조회 컨트롤러
@Controller
public class CheckController {
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public ModelAndView ListCheck() {
		System.out.println("ListCheck 호출");
		return new ModelAndView("check");
	}

}
