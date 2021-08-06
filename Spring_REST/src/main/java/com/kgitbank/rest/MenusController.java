package com.kgitbank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.rest.mapper.MenusMapper;
import com.kgitbank.rest.model.Menus;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/menus")
public class MenusController {
	
	@Autowired
	MenusMapper menusMapper;
	
	@RequestMapping("/select")
	public String selectMenu(Model model) {
		model.addAttribute("menus", menusMapper.getMenusList());
		return "/ajax/crud_home";
	}
}
