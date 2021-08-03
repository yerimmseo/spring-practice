package com.kgitbank.model;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LombokTest {

	// 이 클래스의 로깅을 담당하는 로거를 생성한다. this.getClass() 또는 LombokTest.class
	Logger log = Logger.getLogger(this.getClass());
	
	@Test
	public void test() {
		Employee emp = new Employee(10, "Smith", "ASMITH");
		
		log.fatal(emp);
		log.error(emp);
		log.warn(emp);
		log.info(emp);
		log.debug(emp);
		log.trace(emp);
		
		assertEquals("Getter가 없는 것 같음", 0, emp.getDepartment_id());
	}

}
