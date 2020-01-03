package com.itcinema.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itcinema.services.MovieAdminimpl;
import com.itcineme.model.MovieAdmin;

public class AdminMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		MovieAdminimpl impl=new MovieAdminimpl();
		String userName;
		String email;
		String mobile;
		String password="";
		
		int choice;
		while (true) {

			System.out.println("Enter 1 To SignUp : ");
			System.out.println("Enter 2 To Login : ");
			System.out.println("Enter 3 To Display : ");
			System.out.println("Enter 4 To Exit : ");
			choice = Integer.parseInt(s.next());

			switch (choice) {
			case 1:
				System.out.println("Enter the UserName : ");
				userName = s.next();
				System.out.println("Enter the EmailAddress : ");
				email = s.next();
				System.out.println("Enter the Mobile Number : ");
				mobile = s.next();
				System.out.println("Enter the Password : ");
				password = s.next();
				boolean flag=(impl.addAdmin(userName,email,mobile,password));
				if(flag==true) {
					System.out.println("Admin Added Sucessfully ! ");
					System.out.println();
				}
				else {
					System.out.println("SignUp Failed !! ");
				}
				break;
			case 2:
				System.out.println("Enter the UserName : ");
				userName = s.next();
				System.out.println("Enter the Password : ");
				password = s.next();
				boolean validate=impl.login(userName,password); 
				if(validate==true) {
					System.out.println();
					System.out.println("Login Successfull !! ");
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println("Login Failed !! ");
					System.out.println();
				}
				break;
			case 3:
				List<MovieAdmin> arr=new ArrayList<MovieAdmin>();
				arr=impl.displayAll();
				for(MovieAdmin a:arr) {
					System.out.println();
					System.out.println(a);
					System.out.println();
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}

		}
	}

}
