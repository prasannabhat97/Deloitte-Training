package com.deloitte.projects;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee emp2 = new Employee(1001, "Prasanna", 21800.00, "SE");
		// emp1.deptId = "SE";
		// System.out.println(emp1.deptId);
		// System.out.println(emp2.empId);

		Scanner s = new Scanner(System.in);
		String name;
		String selary;
		boolean a = false, b = false;

		System.out.println("Enter Name :");
		name = s.nextLine();
		System.out.println("Enter Selary :");
		selary = s.nextLine();

		a = Utilities.nameValidation(name);
		b = Utilities.salValidation(selary);
		if (a || b) {
			Employee emp1 = new Employee();
			if (a) {
				emp1.setEmpName(name);
				System.out.println(emp1.getEmpName());
			}
			if(b){
				emp1.setSalary(Double.valueOf(selary));
				System.out.println(emp1.getSalary());
			}

		}

	}

}
