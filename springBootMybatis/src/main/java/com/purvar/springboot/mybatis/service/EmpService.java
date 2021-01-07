package com.purvar.springboot.mybatis.service;

import com.purvar.springboot.mybatis.dto.Emp;

public interface EmpService {
	Emp getEmpById(String empId);
}
