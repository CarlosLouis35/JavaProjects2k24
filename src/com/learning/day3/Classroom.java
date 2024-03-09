package com.learning.day3;

public class Classroom {
	//classRoom -> noOfStudents, type, mode, course, status
	//  -> status(), studying(), exam()
	//  -> getNoOfStudents()  => return noOfStudents
	//  -> getCourse()     => return course
	//    -> updateType()  => take a input value "hybrid"
	
	int noOfStudents;
	String type;
	String mode;
	String course ; 
	String status;
	
	
	public int getNumStudents() {
		
		return noOfStudents;
		
	}
	
	public String getCourse() {
		
		return course;
		
	}
	
	public void updateType(){
		
		type="Hybrid";
	}
	
	
	
}
