package com.purvar.springboot.jdbc.service;

import com.purvar.springboot.jdbc.dto.Emp;

public interface EmpService {
	Emp getEmpById(String empId);
}
