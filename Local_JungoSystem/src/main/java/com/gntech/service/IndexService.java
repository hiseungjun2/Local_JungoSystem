package com.gntech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gntech.dao.IndexDAO;
import com.gntech.dto.orderDTO;

@Service("indexService")
public class IndexService {

	private IndexDAO indexDAO;
	
	@Autowired
	public IndexService(IndexDAO indexDAO) {
		super();
		this.indexDAO = indexDAO;
	}

	// 신청현황
	public List<orderDTO> ListIndex() {
		return indexDAO.ListIndex();
	}

	// 상세조회
	public orderDTO SelectIndex(int id) {
		return indexDAO.SelectIndex(id);
	}

}
