package com.deloitte.projects;

class Utilities {
	 public static boolean nameValidation(String name) {
		 String pattern="^[A-Za-z]+$";
		 if(name.matches(pattern)) {
			 return true;
		 }
		 else {
		     System.out.println("Enter Name in Alphabets");
		     return false;
		 }
	 }
	 public static boolean salValidation(String sal) {
		 String pattern="^[0-9]+$";
		 if(sal.matches(pattern)) {
		 return true;
		 }
		 else {
			 System.out.println(" Enter currecct Salary ");
			 return false;
		 }
	 }
}
