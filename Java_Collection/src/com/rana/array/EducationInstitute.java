package com.rana.array;

public record EducationInstitute(Course[]course,Offer[]offer) 
{
	 public void enrollStudentInCourse(int courseId, String studentName)
	 {
		 for(int i=0;i<course.length;i++)
		 {
			 if(course[i].courseId()==courseId)
			 {
				 
				 IO.println(studentName+" enrolled in : "+course[i].courseName());
				 return;
			 }
		 }
		 IO.println("Course with ID "+courseId+" not found.");
	 }
}
