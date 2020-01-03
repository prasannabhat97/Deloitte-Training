package com.deloitte;

public class ClassroomUtilities {

	public boolean validateClassId(String classId) {
		String pattern = "^[0-9]{4}$";
		if (classId.matches(pattern)) {
			return true;
		} else {
			System.out.println("Enter Currect ClassId :");
			return false;
		}
	}

}
