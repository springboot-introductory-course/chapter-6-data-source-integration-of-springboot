package com.purvar.springboot.jdbc.dao;

import com.purvar.springboot.jdbc.dto.Emp;

public interface EmpDao {
	Emp getEmpById(String empId);
}
