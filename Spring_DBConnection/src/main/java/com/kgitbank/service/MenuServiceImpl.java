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
		System.out.println("동일한 이름의 메뉴가 있는지 체카흐난 코드입니다. 50줄");
		System.out.println("메뉴 이름 형식 체크. 150줄");
		System.out.println("널값 체크. 30줄");
		
		log.info(menu_mapper);
		
		return true;
		// return menu_mapper.newMenu(m) > 0;
	}
	
}
