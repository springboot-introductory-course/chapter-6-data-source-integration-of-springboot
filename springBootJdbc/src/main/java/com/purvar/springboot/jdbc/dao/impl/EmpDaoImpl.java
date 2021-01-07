package com.purvar.springboot.jdbc.dao.impl;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.purvar.springboot.jdbc.dao.EmpDao;
import com.purvar.springboot.jdbc.dto.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Emp getEmpById(String empId) {
		List<Emp> empList = jdbcTemplate.query("select * from springboot_introductory_course.emp where emp_id=?", new Object[] {empId}, new int[] {Types.VARCHAR}, new BeanPropertyRowMapper(Emp.class));
		if (empList != null && empList.size() > 0) {
			return empList.get(0);
		}
		return null;
	}

}
