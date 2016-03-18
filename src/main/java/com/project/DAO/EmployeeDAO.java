package com.project.DAO;

import java.util.List;

import com.project.module.EmployeeTest;

public interface EmployeeDAO {
	public void addEmployee(EmployeeTest emp);
	public void updateEmpoyee(EmployeeTest emp);
	public List<EmployeeTest> getEmployeeList();
	public List<EmployeeTest> getEmployeeListById();

}
