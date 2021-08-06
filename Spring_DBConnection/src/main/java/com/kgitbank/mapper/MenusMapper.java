package com.kgitbank.mapper;

import java.util.List;

import com.kgitbank.model.Menus;

public interface MenusMapper {
	
	public List<Menus> getMenusList();
	public int insertMenu(Menus m);
	public int updateMenu(Menus m);
	public int deleteMenu(String cname);
	
}
