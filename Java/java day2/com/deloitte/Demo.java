package com.deloitte;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Classroomimpl imp = new Classroomimpl();
		ClassroomUtilities clsutil = new ClassroomUtilities();
		int choice, searchId = 0;
		String classId;
		String className;
		int noOfStudents;
		boolean projecter;
		boolean AC;

		ArrayList<Classroom> arr = new ArrayList<Classroom>();

		while (true) {

			System.out.println();
			System.out.println("Enter 1 to Add Classroom ");
			System.out.println("Enter 2 to Search Classroom Details ");
			System.out.println("Enter 3 to Display All classrooms ");
			System.out.println("Enter 4 to Allocation of Classrom ");
			System.out.println("Enter 5 to Login ");
			System.out.println("Enter 6 to Exit ");
			System.out.println("Enter Your Choice :");
			choice = s.nextInt();
			System.out.println();

			switch (choice) {

			case 1:
				System.out.println("Count = " + Classroom.getCount());
				while (true) {
					System.out.println(" Enter class Id :");
					classId = s.next();
					if (clsutil.validateClassId(classId)) {
						break;
					} else {
						continue;
					}
				}

				System.out.println("Enter class Name :");
				className = s.next();
				System.out.println("Enter No of students : ");
				noOfStudents = Integer.parseInt(s.next());
				System.out.println("Need projecter? (true|false) :");
				projecter = Boolean.parseBoolean(s.next());
				System.out.println("Need AC? (true|false) :");
				AC = Boolean.parseBoolean(s.next());

				arr.add(imp.addClassroom(Integer.parseInt(classId), className, noOfStudents, projecter, AC));

				break;

			case 2:
				System.out.println("Enter classId fo rhe classroom :");
				searchId = Integer.parseInt(s.next());
				Classroom temp = imp.searchRooms(searchId, arr);
				if (temp == null) {
					System.out.println("Room Not Found !!");
				} else {
					System.out.println(temp);
				}

				break;

			case 3:
				imp.displyAllRooms(arr);
				break;
			case 4:

				System.out.println("How Meny Classrooms needed ? :");
				int reqClasses = Integer.parseInt(s.next());
				System.out.println("How meny Systems needed ? :");
				int reqSys = Integer.parseInt(s.next());

				boolean flag = imp.allocateRooms(reqClasses, reqSys, arr);

				if (flag == false) {
					System.out.println("Class Not Allocated !!");
				} else {
					System.out.println("Class allocated successfully !!");
				}

				break;
			case 5:
				System.out.println("Enter your UserName : ");
				String userName = s.next();
				System.out.println("Enter your Password : ");
				String userPassword = s.next();
				boolean valid = imp.login(userName, userPassword);
				if (valid) {
					System.out.println("Login Sucessfull !! ");
				} else {
					System.out.println("Login Failed !!");
				}
				break;

			case 6:
				System.exit(0);
				s.close();
			default:
				break;
			}
		}

	}
}
