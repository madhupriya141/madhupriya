package com.ntt.dao;

import com.ntt.exceptions.EmployeeExceptions;

public interface IEmployeeDAO {
	public int addEmployee(int employeeId, String empName, String empType, String empExperience) throws EmployeeExceptions;
}	
