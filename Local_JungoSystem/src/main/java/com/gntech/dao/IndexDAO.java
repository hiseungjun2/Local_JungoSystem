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

	// ��û��Ȳ ����Ʈ
	public List<orderDTO> ListIndex() {
		List<orderDTO> list = sqlSessionFactory.openSession().selectList("usernamespace.ListIndex");
		return list;
	}

	// ��û���� ����ȸ
	public orderDTO SelectIndex(int id) {
		orderDTO dto = sqlSessionFactory.openSession().selectOne("usernamespace.SelectIndex", id);
		return dto;
	}

	// ��û���� ����
	public int CheckYIndex(orderDTO dto, int i) {
		int n = 0;
		if (i == 1) {		// �ݾ� ������ ������ (������)
			n = sqlSessionFactory.openSession().update("usernamespace.CheckYIndex", dto);
		} else {		// �ݾ� ������ ������ (���԰�������)
			n = sqlSessionFactory.openSession().update("usernamespace.CheckYIndexPrice", dto);
		} 
		return n;
	}

	// ��û���� ����
	public int CheckNIndex(int id) {
		int n = sqlSessionFactory.openSession().update("usernamespace.CheckNIndex", id);
		return n;
	}

}
