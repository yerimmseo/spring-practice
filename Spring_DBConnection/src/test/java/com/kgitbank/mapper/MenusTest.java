package com.kgitbank.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgitbank.model.Menus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MenusTest {
	
	@Autowired
	private MenusMapper menusMapper;
	
	@Test
	public void getMenusListTest() {
		List<Menus> menus = menusMapper.getMenusList();
		
		for (Menus menu : menus) {
			System.out.println(menu);
		}
	}
	
	@Ignore
	@Test
	public void insertMenuTest() {
		Menus menu = new Menus("에스프레소", 4100, 10);
		assertEquals(1, menusMapper.insertMenu(menu));
	}
	
	@Ignore
	@Test
	public void updateMenuTest() {
		Menus menu = new Menus("아메리카노", 5100, 20);
		assertEquals(1, menusMapper.updateMenu(menu));
	}
	
	@Test
	public void deleteMenuTest() {
		menusMapper.deleteMenu("에스프레소");
	}
	
}
