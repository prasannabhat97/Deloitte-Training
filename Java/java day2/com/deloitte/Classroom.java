package com.deloitte;

public class Classroom {

	private static int count;
	static int avlRooms;

	public static int getAvlRooms() {
		return avlRooms;
	}

	public static void setAvlRooms(int avlRooms) {
		Classroom.avlRooms = avlRooms;
	}

	private int classId;
	private String className;
	private int noOfStudents;
	private boolean projecter;
	private boolean AC;
	private String faculty;
	private boolean avilability;

	public Classroom() {
		++count;
		avlRooms = 0;
	}

	static {
		count = 0;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Classroom.count = count;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public boolean isProjecter() {
		return projecter;
	}

	public void setProjecter(boolean projecter) {
		this.projecter = projecter;
	}

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public boolean isAvilability() {
		return avilability;
	}

	public void setAvilability(boolean avilability) {
		this.avilability = avilability;
	}

	@Override
	public String toString() {
		return "Classroom [classId=" + classId + ", className=" + className + ", noOfStudents=" + noOfStudents
				+ ", projecter=" + projecter + ", AC=" + AC + ", faculty=" + faculty + ", avilability=" + avilability
				+ "]";
	}

}
