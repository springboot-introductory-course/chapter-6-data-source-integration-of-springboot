-- 员工表
CREATE TABLE emp(
  emp_id varchar(5) NOT NULL, 
  emp_name nvarchar(20) , 
  sex char(5),
  age int,
  dept_id varchar(3),
  salary int,
  CONSTRAINT PK_emp PRIMARY KEY (emp_id ));
