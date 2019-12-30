package com.deloitte;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Classroom rooms[]=null;
		int choice,searchId=0,noSys=0;
		String facultyName;
		boolean flag=false,alocationFlag=false;
		
		while(true) {
		System.out.println();
		System.out.println("Enter 1 to Add Classroom");
		System.out.println("Enter 2 to Display Classroom Details");
		System.out.println("Enter 3 to Display All classrooms");
		System.out.println("Enter 4 to Allocation of Classrom");
		System.out.println("Enter 5 to exit");
		System.out.println("Enter Your Choice :");
		choice=s.nextInt();
		System.out.println();
		
		
		switch(choice) {
		case 1:
		System.out.println("Enter no of classes needed :");
		String n=s.next();
		int k=1;
		rooms = new Classroom[Integer.parseInt(n)];
		for(int i=0;i<Integer.parseInt(n);i++) {
			
			 rooms[i]=new Classroom();
			
			System.out.println("Enter "+ k++ +"th class room details ");
			
			System.out.println(" Enter class Id :");
			rooms[i].setClassId(Integer.parseInt(s.next()));
			System.out.println("Enter class Name :");
			rooms[i].setClassName(s.next());
			System.out.println("Enter No of students : ");
			rooms[i].setNoOfStudents(Integer.parseInt(s.next()));
			System.out.println("Need projecter? (true|false) :");
			rooms[i].setProjecter(Boolean.parseBoolean(s.next()));
			System.out.println("Need AC? (true|false) :");
			rooms[i].setAC(Boolean.parseBoolean(s.next()));
			rooms[i].setFaculty("");
			rooms[i].setAvilability(true);
		}
			break;
		case 2:
			System.out.println("Enter classId fo rhe classroom :");
			searchId=Integer.parseInt(s.next());
			for(Classroom i:rooms) {
				if(i.getClassId()==searchId) {
					System.out.println();
					System.out.println(i);
					System.out.println();
					flag=true;
					break;
				}
			}
			if(flag==false) {
				
					System.out.println("Classroom Not Found !!");
			}
			break;
				
		case 3:
		for(Classroom room:rooms) {
			System.out.println(room);
			System.out.println();
		}
			break;
		case 4:
			System.out.println("Enter Req.No Of Systems :");
			noSys=Integer.parseInt(s.next());
			for(Classroom room: rooms) {
				if(room.getNoOfStudents()>=noSys) {
					if(room.isAvilability()==true) {
						System.out.println("Enter Faculty Name :");
						facultyName=s.next();
						room.setFaculty(facultyName);
						room.setAvilability(false);
						room.setNoOfStudents(noSys);
						alocationFlag=true;
						System.out.println("Classroom Alocated !!");
						break;
					}
					else {
						alocationFlag=false;
					}
				}	
			}
			if(alocationFlag==false) {
				System.out.println("Classrooms Not avilable !!");
			}
			break;
			
		case 5:
			System.exit(0);
			s.close();
		default:
			break;
		}
	 }
	
	}
}
