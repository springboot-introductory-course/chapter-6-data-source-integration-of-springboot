package com.purvar.springboot.jdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purvar.springboot.jdbc.dao.EmpDao;
import com.purvar.springboot.jdbc.dto.Emp;
import com.purvar.springboot.jdbc.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao dao;
	
	@Override
	public Emp getEmpById(String empId) {
		return dao.getEmpById(empId);
	}

}
