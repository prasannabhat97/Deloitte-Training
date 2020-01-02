package com.deloitte;

import java.util.ArrayList;

public interface ClassroomInterface {

	public Classroom addClassroom(int classId, String className, int noSys, boolean projector, boolean AC);

	public boolean allocateRooms(int reqRooms, int reqSys, ArrayList<Classroom> room);

	public void displyAllRooms(ArrayList<Classroom> room);

	public Classroom searchRooms(int roomId, ArrayList<Classroom> rooms);

	public boolean login(String userName, String userPassword);

}
