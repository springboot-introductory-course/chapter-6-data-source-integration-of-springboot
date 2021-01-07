-- 部门表
CREATE TABLE dept (
  dept_id varchar(3) NOT NULL,
  dept_name nvarchar(20) NOT NULL,
CONSTRAINT PK_dept PRIMARY KEY (dept_id) );
