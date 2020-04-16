package com.ntt.dao;

import com.ntt.myClass.Employee;

public class TemporaryEmployee extends EmployeeDAO {
	private String empName;
	private String empType;
	private double salary;
	private int employeeId;

	public TemporaryEmployee(int employeeId, String empName, String empType, double salary) {
		super();
		this.setEmployeeId(employeeId);
		this.setEmpName(empName);
		this.setEmpType(empType);
		this.setSalary(salary);
	}

	public double salaryOfTemporaryEmployee(Employee e) {
		int exp = (Integer) null;
		int basic_salary = 1500;
		double sal;
		sal = basic_salary * exp * 3;
		e.salary = sal;

		return sal;

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

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "TemporaryEmployee [empName=" + empName + ", empType=" + empType + ", salary=" + salary + ", employeeId="
				+ employeeId + "]";
	}

}
