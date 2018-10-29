package com.gntech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gntech.dto.orderDTO;
import com.gntech.service.IndexService;

// 신청조회 컨트롤러
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
	public ModelAndView ListIndex(HttpServletRequest request) {
		System.out.println("ListIndex 호출");

		int currentPage = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = 12;
		int count = 0;
		count = indexService.SelectIndexCount();

		if (count == (currentPage - 1) * pageSize) {
			currentPage -= 1;
		}
		
		int startRow = (currentPage -1) * pageSize +1;	// 현재 페이지의 시작글 번호
		
		if (startRow < 0) {
			startRow = 1;
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("list", indexService.ListIndex(startRow, pageSize));
		mav.addObject("count", count);
		
		return mav;
	}

	// 신청내역 상세조회
	@RequestMapping(value = "/indexInfo", method = RequestMethod.GET)
	public ModelAndView SelectIndex(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("SelectIndex 호출");
		return new ModelAndView("index_info", "select", indexService.SelectIndex(id));
	}

	// 신청내역 수락
	@RequestMapping(value = "/checkY", method = RequestMethod.GET)
	public String CheckYIndex(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));
		int return_price = Integer.parseInt(request.getParameter("return_price"));
		int price = Integer.parseInt(request.getParameter("price"));

		orderDTO dto = new orderDTO();
		dto.setId(id);
		dto.setReturn_price(return_price);

		int n = 0;

		if (return_price == price) { // 매입 금액 변동 없을때 (진행중)
			n = indexService.CheckYIndex(dto, 1);
		} else { // 매입 금액 변동 있을때 (매입가검토중)
			n = indexService.CheckYIndex(dto, 2);
		}

		System.out.println("CheckY 호출");

		if (n > 0) {
			System.out.println("CheckY 성공");
			return "redirect:/index?pageNum=1";
		} else {
			System.out.println("CheckY 실패");
			return "redirect:/index?pageNum=1";
		}
	}

	// 신청내역 거절
	@RequestMapping(value = "/checkN", method = RequestMethod.GET)
	public String CheckNIndex(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("CheckN 호출");
		int n = indexService.CheckNIndex(id);
		if (n > 0) {
			System.out.println("CheckN 성공");
			return "redirect:/index?pageNum=1";
		} else {
			System.out.println("CheckN 실패");
			return "redirect:/index?pageNum=1";
		}
	}

}
