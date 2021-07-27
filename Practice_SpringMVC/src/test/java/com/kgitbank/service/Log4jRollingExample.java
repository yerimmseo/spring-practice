package com.kgitbank.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Log4jRollingExample {

	@Test
    public void test() {
        for(int i = 0; i < 2000; i++) {
            log.info("This is the " + i + " time I say 'Hello World'.");
        }
    }
	
}
