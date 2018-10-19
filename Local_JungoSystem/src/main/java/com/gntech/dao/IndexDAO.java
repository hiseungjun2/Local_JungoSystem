package com.gntech.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gntech.dto.orderDTO;

@Repository("indexDAO")
public class IndexDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	// 신청현황 리스트
	public List<orderDTO> ListIndex() {
		List<orderDTO> list = sqlSessionFactory.openSession().selectList("usernamespace.ListIndex");
		return list;
	}

	// 신청내역 상세조회
	public orderDTO SelectIndex(int id) {
		orderDTO dto = sqlSessionFactory.openSession().selectOne("usernamespace.SelectIndex", id);
		return dto;
	}

}
