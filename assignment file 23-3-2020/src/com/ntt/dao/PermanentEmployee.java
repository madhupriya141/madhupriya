package com.ntt.dao;

import com.ntt.myClass.Employee;

public class PermanentEmployee extends EmployeeDAO {
	private int employeeId;
	private String empName;
	private String empType;
	private double salary;
	private String empExperience;

	public PermanentEmployee(int employeeId, String empName, String empType, String empExperience, double salary) {
		super();
		this.setEmployeeId(employeeId);
		this.setEmpName(empName);
		this.setEmpType(empType);
		this.setEmpExperience(empExperience);
		this.setSalary(salary);
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", empName=" + empName + ", empType=" + empType
				+ ", salary=" + salary + ", empExperience=" + empExperience + "]";
	}

	public double salaryOfPermanentEmployee(Employee e) {
		int exp = 2;
		int basic_sal = 3500;
		double sal;
		sal = basic_sal * exp * 5;
		e.salary = sal;
		return sal;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpExperience() {
		return empExperience;
	}

	public void setEmpExperience(String empExperience) {
		this.empExperience = empExperience;
	}

}
