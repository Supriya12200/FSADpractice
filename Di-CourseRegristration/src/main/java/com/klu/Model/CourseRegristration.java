package com.klu.Model;

public class CourseRegristration {
	private int rollno;
	private String studentName;
	private String courseName;
	private int semester;
	public CourseRegristration(int rollno,String studentName) {
		this.rollno=rollno;
		this.studentName=studentName;
		
	}
	public void  setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setSemester(int semester) {
		this.semester=semester;
	}
	public void display() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+studentName);
		System.out.println("CourseName:"+courseName);
		System.out.println("Semester:"+semester);
	}
	

}
