package com.deloitte.projects;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String deptId;

	public Employee() {
	}

	public Employee(int empId, String empName, double salary, String deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public void deptChange() {
		System.out.println(" Inside deptChange ");
	}

	public double salIncriment(double amount) {
		System.out.println(" Inside salIncriment ");
		return 10.33;
	}
}
