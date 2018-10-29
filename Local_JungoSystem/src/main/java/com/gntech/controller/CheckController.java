package com.gntech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gntech.dto.orderDTO;
import com.gntech.service.CheckService;

// ������ȸ ��Ʈ�ѷ�
@Controller
public class CheckController {

	private CheckService checkService;

	@Autowired
	public CheckController(CheckService checkService) {
		super();
		this.checkService = checkService;
	}

	// �������� ���� ����Ʈ
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public ModelAndView ListCheck(HttpServletRequest request) {
		System.out.println("ListCheck ȣ��");
		int currentPage = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = 12;
		int count = 0;
		count = checkService.SelectCheckCount();

		if (count == (currentPage - 1) * pageSize) {
			currentPage -= 1;
		}
		
		int startRow = (currentPage -1) * pageSize +1;	// ���� �������� ���۱� ��ȣ
		
		if (startRow < 0) {
			startRow = 1;
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("check");
		mav.addObject("list", checkService.ListCheck(startRow, pageSize));
		mav.addObject("count", count);
		
		return mav;
		
	}

	// ���䳻�� ����ȸ
	@RequestMapping(value = "/checkInfo", method = RequestMethod.GET)
	public ModelAndView SelectCheck(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("SelectCheck ȣ��");
		return new ModelAndView("check_info", "select", checkService.SelectCheck(id));
	}

	// ���䳻�� �޸� �߰�
	@RequestMapping(value = "/writeMemo", method = RequestMethod.GET)
	public String InsertMemo(HttpServletRequest request) {
		System.out.println("InsertMemo ȣ��");
		int id = Integer.parseInt(request.getParameter("id"));
		String memo = request.getParameter("memo");
		orderDTO dto = new orderDTO();
		dto.setId(id);
		dto.setMemo(memo);
		int n = checkService.InsertMemo(dto);
		if (n > 0) {
			System.out.println("Insert ����");
			return "redirect:/check?pageNum=1";
		} else {
			System.out.println("Insert ����");
			return "redirect:/check?pageNum=1";
		}
	}
	
	// ���ſϷ� 
	@RequestMapping(value="/ResultStatus", method=RequestMethod.GET) 
	public String UpdateResult(HttpServletRequest request) {
		System.out.println("UpdateResult ȣ��");
		int id = Integer.parseInt(request.getParameter("id"));
		int n = checkService.UpdateResult(id);
		if (n > 0) {
			return "redirect:/result";
		} else {
			return "redirect:/result";
		}
	}

}
