package com.rana.course_rejistration;
/*
 Create a Scenario based program on Course Registration System using HashMap where multiple students can be added in a particular course.
[See the Test cases].

In the HashMap, Course Name will be the HashMap key, where as List<String>
will become HashMap value.

Coding Requirements :
---------------------
Take an ELC class CourseRegistration with main method.

In this main method create one HashMap object which takes Course name(String) as a key and Students name (List<String>) as a value.

Create Scanner class object to perform various operation on CourseRegistration system by using switch case.


--- Course Registration Menu ---
1. Register student to course [use V computeIfAbsent(key, Function<T,R>)]
2. Remove student from course [use V computeIfPresent(key, BiFunction<T,U,R>)]
3. View course-wise student list
4. Exit
Enter your choice:  


Test Cases for Output :
-----------------------
Test Case 1 :
-------------
--- Course Registration Menu ---
1. Register student to course
2. Remove student from course
3. View course-wise student list
4. Exit
Enter your choice: 1
Enter course name: Java
Enter student name: Raj
Raj registered to Java

--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 2

 Course → Students List:
Java → [Ravi, Ankita, Sneha]
HTML → [Raj, Rohit]
Python → [Scott, Smith]

--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 3
Enter course name: HTML
Enter student name to remove: Raj
Raj : has removed from HTML


--- Course Registration Menu ---
1. Register student to course
2. View course-wise student list
3. Remove student from course
4. Exit
Enter your choice: 4
Exiting Course Registration System.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseRegistration
{
	public static void main(String[] args) 
	{
		HashMap<String , List<String>> hs=new HashMap<>();
		while(true)
		{
			System.out.println("--- Course Registration Menu ---");
			System.out.println("1. Register student to course");
			System.out.println("2. Remove student from course");
			System.out.println("3. View course-wise student lis");
			System.out.println("4. Exit");
			
			int choice=Integer.parseInt(IO.readln("Enter your choice"));
			
			switch(choice)
			{
			case 1->
			{
				String courseName=IO.readln("Enter course name");
				String studentName=IO.readln("Enter student name");
				if(hs.computeIfAbsent(courseName,(key)->new ArrayList<String>()).add(studentName))
				{
					System.out.println(studentName +" registered to "+courseName);
				}
				else
				{
					IO.println("Data is Already available.");
				}
			
			}
			
			case 3->
			{
				IO.println(" Course → Students List:");
				for(Map.Entry<String, List<String>>entry:hs.entrySet())
				{
					IO.println(entry.getKey()+" -> "+entry.getValue());
				}
			}
			case 2->
			{
				String courseName=IO.readln("Enter course name");
				String studentName=IO.readln("Enter student name to remove:");
				if(hs.computeIfPresent(courseName,(key,value)->value).remove(studentName))
				{
					System.out.println(studentName+" : has removed from "+courseName);
				}
				else
				{
					IO.println("Data is not available.");
				}
				
				
			}
			
			case 4->
			{
				System.out.println("Exiting Course Registration System.");
				System.exit(0);
			}
			}
		}
	}
}
