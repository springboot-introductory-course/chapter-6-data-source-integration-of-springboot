package com.purvar.springboot.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purvar.springboot.mybatis.dto.Emp;
import com.purvar.springboot.mybatis.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/{empId}")
	public Emp getEmp(@PathVariable String empId) {
		Emp emp = empService.getEmpById(empId);
		return emp;
	}
}
