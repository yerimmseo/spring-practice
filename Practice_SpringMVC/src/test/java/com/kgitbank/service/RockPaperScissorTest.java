package com.kgitbank.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class RockPaperScissorTest {
	
	@Autowired
	RockPaperScissors game;
	
	@Test
	public void test() {
		String[] user = { "가위", "바위", "보" };
		
		int num = 0;
		while (num++ < 20) {
			log.info(game.versus(user[(int)(Math.random() * 2)]));
		}
	}

}
