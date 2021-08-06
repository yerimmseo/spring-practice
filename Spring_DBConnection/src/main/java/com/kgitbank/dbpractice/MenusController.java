package com.kgitbank.dbpractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.mapper.MenusMapper;
import com.kgitbank.model.Menus;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/menus")
public class MenusController {
	
	@Autowired
	MenusMapper menusMapper;
	
	@RequestMapping("/insert")
	public void insertPage() {}
	
	@RequestMapping("/insert/menu")
	public String insertMenu(Menus menu) {
		menusMapper.insertMenu(menu);
		log.info("�޴� ��� ����");
		
		return "redirect:/crud";
	}
	
	@RequestMapping("/select")
	public void selectMenu(Model model) {
		model.addAttribute("menus", menusMapper.getMenusList());
	}
	
	@RequestMapping("/update")
	public void update(Model model) {
		List<Menus> menus = menusMapper.getMenusList();
		model.addAttribute("menus", menus);
	}
	
	@RequestMapping("/update/menu")
	public String updateMenu(Menus menu) {
		menusMapper.updateMenu(menu);
		
		log.info("�޴� ������Ʈ ����");
		
		return "redirect:/menus/update";
	}
	
	@RequestMapping("/delete")
	public void delete(Model model) {
		List<Menus> menus = menusMapper.getMenusList();
		model.addAttribute("menus", menus);
	}
	
	@RequestMapping("/delete/menu")
	public String deleteMenu(String cname) {
		menusMapper.deleteMenu(cname);
		
		log.info("�޴� ���� ����");
		
		return "redirect:/menus/delete";
	}
	
}
