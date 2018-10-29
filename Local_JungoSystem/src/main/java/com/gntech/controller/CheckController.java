package com.gntech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gntech.dto.orderDTO;
import com.gntech.service.CheckService;

// 검토조회 컨트롤러
@Controller
public class CheckController {

	private CheckService checkService;

	@Autowired
	public CheckController(CheckService checkService) {
		super();
		this.checkService = checkService;
	}

	// 진행중인 상태 리스트
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public ModelAndView ListCheck(HttpServletRequest request) {
		System.out.println("ListCheck 호출");
		int currentPage = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = 12;
		int count = 0;
		count = checkService.SelectCheckCount();

		if (count == (currentPage - 1) * pageSize) {
			currentPage -= 1;
		}
		
		int startRow = (currentPage -1) * pageSize +1;	// 현재 페이지의 시작글 번호
		
		if (startRow < 0) {
			startRow = 1;
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("check");
		mav.addObject("list", checkService.ListCheck(startRow, pageSize));
		mav.addObject("count", count);
		
		return mav;
		
	}

	// 검토내역 상세조회
	@RequestMapping(value = "/checkInfo", method = RequestMethod.GET)
	public ModelAndView SelectCheck(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("SelectCheck 호출");
		return new ModelAndView("check_info", "select", checkService.SelectCheck(id));
	}

	// 검토내역 메모 추가
	@RequestMapping(value = "/writeMemo", method = RequestMethod.GET)
	public String InsertMemo(HttpServletRequest request) {
		System.out.println("InsertMemo 호출");
		int id = Integer.parseInt(request.getParameter("id"));
		String memo = request.getParameter("memo");
		orderDTO dto = new orderDTO();
		dto.setId(id);
		dto.setMemo(memo);
		int n = checkService.InsertMemo(dto);
		if (n > 0) {
			System.out.println("Insert 성공");
			return "redirect:/check?pageNum=1";
		} else {
			System.out.println("Insert 실패");
			return "redirect:/check?pageNum=1";
		}
	}
	
	// 수거완료 
	@RequestMapping(value="/ResultStatus", method=RequestMethod.GET) 
	public String UpdateResult(HttpServletRequest request) {
		System.out.println("UpdateResult 호출");
		int id = Integer.parseInt(request.getParameter("id"));
		int n = checkService.UpdateResult(id);
		if (n > 0) {
			return "redirect:/result";
		} else {
			return "redirect:/result";
		}
	}

}
