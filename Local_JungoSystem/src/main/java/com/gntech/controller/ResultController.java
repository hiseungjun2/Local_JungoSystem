package com.gntech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// �Ϸ���ȸ ��Ʈ�ѷ�
@Controller
public class ResultController {
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public ModelAndView ListResult() {
		System.out.println("ListResult ȣ��");
		return new ModelAndView("result");
	}

}
