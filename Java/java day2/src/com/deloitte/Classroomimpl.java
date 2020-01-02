package com.deloitte;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroomimpl implements ClassroomInterface {

	Scanner s = new Scanner(System.in);
	Classroom cls = new Classroom();

	@Override
	public Classroom addClassroom(int classId, String className, int noSys, boolean projector, boolean AC) {
		// TODO Auto-generated method stub
		Classroom cls = new Classroom();
		cls.setClassId(classId);
		cls.setClassName(className);
		cls.setNoOfStudents(noSys);
		cls.setProjecter(projector);
		cls.setAC(AC);
		cls.setFaculty("");
		cls.setAvilability(true);
		return cls;
	}

	@Override
	public Classroom searchRooms(int roomId, ArrayList<Classroom> rooms) {
		// TODO Auto-generated method stub

		for (Classroom i : rooms) {
			if (i.getClassId() == roomId) {
				return i;
			}
		}

		return null;
	}

	@Override
	public void displyAllRooms(ArrayList<Classroom> room) {
		// TODO Auto-generated method stub
		for (Classroom r : room) {
			System.out.println(r);
		}
	}

	@Override
	public boolean allocateRooms(int reqRooms, int reqSys, ArrayList<Classroom> room) {
		// TODO Auto-generated method stub
		int ct = 0;
		if (room.size() >= reqRooms) {
			for (Classroom c : room) {
				if (c.isAvilability() == true && c.getNoOfStudents() >= reqSys) {
					ct++;
				}
			}

			if (ct >= reqRooms) {
				for (Classroom c : room) {
					if (c.isAvilability() == true && c.getNoOfStudents() >= reqSys) {
						System.out.println("Enter Faculty Name :");
						String abc = s.next();
						c.setFaculty(abc);
						c.setAvilability(false);
					}
				}
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		if (userName.equals("admin") && userPassword.equals("admin")) {
			return true;
		} else {
			return false;
		}

	}

}
