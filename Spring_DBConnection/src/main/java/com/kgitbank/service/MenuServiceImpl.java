package com.kgitbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgitbank.mapper.MenuMapper;
import com.kgitbank.model.Menu;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuMapper menu_mapper;
	
	public boolean addMenu(Menu m) {
		System.out.println("������ �̸��� �޴��� �ִ��� üī�峭 �ڵ��Դϴ�. 50��");
		System.out.println("�޴� �̸� ���� üũ. 150��");
		System.out.println("�ΰ� üũ. 30��");
		
		log.info(menu_mapper);
		
		return true;
		// return menu_mapper.newMenu(m) > 0;
	}
	
}
