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
	
	// �ڵ����� �˻�
	@Autowired
	public IndexController(IndexService indexService) {
		super();
		this.indexService = indexService;
	}

	// ��û��ȸ ȭ��(����)
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView ListIndex() {
		System.out.println("ListIndex ȣ��");
		return new ModelAndView("index", "list", indexService.ListIndex());
	}
	
	// ��û���� ����ȸ
	@RequestMapping(value="/indexInfo", method = RequestMethod.GET)
	public ModelAndView SelectIndex(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("SelectIndex ȣ��");
		return new ModelAndView("index_info", "select", indexService.SelectIndex(id));
	}
	
	// ��û���� ����
	@RequestMapping(value="/checkY", method=RequestMethod.GET)
	public String CheckYIndex(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("CheckY ȣ��");
		int n = indexService.CheckYIndex(id);
		if (n > 0) {
			System.out.println("CheckY ����");
			return "redirect:/index";
		} else {
			System.out.println("CheckY ����");
			return "redirect:/index";
		}
	}
	
	// ��û���� ����
		@RequestMapping(value="/checkN", method=RequestMethod.GET)
		public String CheckNIndex(HttpServletRequest request) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("CheckN ȣ��");
			int n = indexService.CheckNIndex(id);
			if (n > 0) {
				System.out.println("CheckN ����");
				return "redirect:/index";
			} else {
				System.out.println("CheckN ����");
				return "redirect:/index";
			}
		}
	
}
