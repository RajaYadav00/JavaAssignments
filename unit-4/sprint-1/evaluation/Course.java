package com.unit4Evaluation1;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	void displayCourseDetails(int id,String name,int fee) {
		System.out.println("CourseId "+id);
		System.out.println("CourseName "+name);
		System.out.println("CourseFee "+fee);
	}
	public static void authenticate( String username,String password) {
		if(username=="Admin"&&password=="1234") {
			Course obj1=new Course();
			obj1.courseId=142;
			obj1.courseName="Raja";
		    obj1.courseFee=300000;
		    obj1.displayCourseDetails(obj1.courseId, obj1.courseName, obj1.courseFee);
			}else {
				System.out.println("Invalid Username or password");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		authenticate("Admin","1234");
		authenticate("raja","5233");

	}

}
