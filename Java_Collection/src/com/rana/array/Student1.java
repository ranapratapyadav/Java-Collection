package com.rana.array;

public record Student1(String StudentName,EducationInstitute institute) 
{
	
	public void viewCoursesAndFees()
	{
//		System.out.println("Enter the student name : ");
		Course[]course=institute.course();
		for (Course course2 : course) {
			System.out.println(course2);
		}
	}
	
	public void viewOffers()
	{
		Offer[] offer=institute.offer();
		for (Offer offer2 : offer) {
			System.out.println(offer2);
		}
	}
	
	public void enrollInCourse(Integer courseId)
	{
		institute.enrollStudentInCourse(courseId, StudentName);
	}

}
