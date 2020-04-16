package com.ntt.myClass;

public class Employee {
	private int employeeId;
	private String empName;
	private String empType;
	private String empExperience;
	public double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String empName, String empType, String empExperience, double salary) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empType = empType;
		this.empExperience = empExperience;
		this.salary = salary;
	}

	public Employee(int employeeId, String empName, String empType, double salary) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empType = empType;
		this.salary = salary;
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

	public String getEmpExperience() {
		return empExperience;
	}

	public void setEmpExperience(String empExperience) {
		this.empExperience = empExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", empType=" + empType
				+ ", empExperience=" + empExperience + ", salary=" + salary + "]";
	}

}
