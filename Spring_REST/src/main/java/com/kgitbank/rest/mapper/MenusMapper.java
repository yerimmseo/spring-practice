package com.kgitbank.rest.mapper;

import java.util.List;

import com.kgitbank.rest.model.Menus;

public interface MenusMapper {
	
	public List<Menus> getMenusList();
	public int insertMenu(Menus m);
	public int updateMenu(Menus m);
	public int deleteMenu(String cname);
	
}
