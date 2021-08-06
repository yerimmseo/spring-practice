package com.kgitbank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kgitbank.model.Employee;

// 연습: Departments 테이블도 똑같은 방식으로 꺼내보세요
public interface EmployeeMapper {
	
	@Select("SELECT * FROM employees")
	public List<Employee> getEmpList();
	
	public List<Employee> getEmpList2();
	
	public Employee getEmployee(int id);
	
	public int create(Employee e);
	
}
