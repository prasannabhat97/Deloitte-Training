package com.deloitte.projects;

public class helloworld {

	public static void main(String[] args) {
		System.out.println("Hello World !!");
		System.out.println("Sum = "+add(4,6));
		System.out.println("Sub = "+sub(8,3));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
}
