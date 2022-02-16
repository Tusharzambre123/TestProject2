package com.Dao;

import java.util.List;

import com.Model.Employee;



public interface EmployeeDao 
{
	  boolean insertEmployee(Employee e);
	  boolean deleteEmployeeById(int empid);
	  boolean updateEmployee(Employee e);
	  List<Employee> getAllEmployees();
	  Employee getEmployeeById(int empid);

}
