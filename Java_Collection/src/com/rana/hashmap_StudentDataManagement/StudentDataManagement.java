package com.rana.hashmap_StudentDataManagement;

/*
 Create a Scenario based program on Student Management System using HashMap where we need to Add Student, Update Marks, Delete Student, Search Student, Display All Students, Show Lowest Scorer, Show Total and Average Marks.

Coding Requirements :
---------------------
Take an ELC class StudentDataManagement with main method.

In this main method create one HashMap object which takes Student name as a key and Student marks as a value.

Create IO class object perform various operation on Student object by using switch case.

------ Student Management Menu ------
1. Add Student
2. Update Marks
3. Delete Student
4. Search Student
5. Display All Students
6. Show Topper
7. Show Lowest Scorer
8. Show Total and Average Marks
9. Exit
Enter your choice: 


Test Cases for Output :
-----------------------
Test Case 1 :
-------------
Enter your choice: 1
Enter student name: Ankit
Enter marks: 89
Student added successfully!



Test Case 2 :
-------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Enter new marks: 93
Marks updated.


Test Case 3:
-------------
Enter your choice: 3
Enter student name to delete: Ankit
Student deleted.


Test Case 4:
------------
Enter your choice: 4
Enter student name to search: Elina
Elina scored 99


Test Case 5:
------------
Enter your choice: 5
---- Student Records ----
Ravishankar => 99
Puja  => 89
Elina => 99
Aryan => 98


Test Case 6:
------------
Enter your choice: 6
Topper: Ravishankar => 99


Test Case 7:
------------
Enter your choice: 7
Lowest Scorer: Puja  => 89

Test Case 8:
------------
Enter your choice: 8
Total Marks: 385
Average Marks: 96.25

Test Case 9:
-------------
Enter your choice: 9
Exiting... Thank you!


Test Cases for Input Validation :
----------------------------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Student not found.

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  StudentDataManagement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String ,Integer>hs=new HashMap<>();
		
		while(true)
		{
			System.out.println("------ Student Management Menu ------");
			System.out.println("1. Add Student");
			System.out.println("2. Update Marks");
			System.out.println("3. Delete Student");
			System.out.println("4. Search Student");
			System.out.println("5. Display All Students");
			System.out.println("6. Show Topper");
			System.out.println("7. Show Lowest Scorer");
			System.out.println("8. Show Total and Average Marks");
			System.out.println("9. Exit");
			System.out.println("Enter the choice.");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1->
				{
					System.out.println("Enter student name:");
					String name=sc.nextLine();
					System.out.println("Enter marks: ");
					int marks=sc.nextInt();
					hs.put(name, marks);
					System.out.println("Student added successfully!");
				}
				
				case 2->
				{
					System.out.println("Enter student name to update the marks :");
					String name=sc.nextLine();
					if(hs.containsKey(name))
					{
						System.out.println("Enter the new Marks: ");
						int marks=sc.nextInt();
						hs.put(name, marks);
						System.out.println("Marks updated.");
					}
					else
					{
						System.out.println("Key is not available is this collection.");
					}
				}
				
				case 3->
				{
					System.out.println("Enter student name to delete: ");
					String name=sc.nextLine();
					
					if(hs.containsKey(name))
					{
						hs.remove(name);
						System.out.println("Student deleted.");
					}
					else
					{
						System.out.println("Key is not available is this collection.");
					}
									
				}
				
				case 4->
				{
					System.out.println("Enter student name to search: ");
					String name=sc.nextLine();
					
					if(hs.containsKey(name))
					{
						IO.print(hs.get(name));
					}
					else
					{
						System.out.println("Key is not available is this collection.");
					}
				}
				
				case 5->
				{
					System.out.println("---- Student Records ----");
					
					if(hs.isEmpty())
					{
						System.out.println("Student is not available");
						
					}
					else
					{
//						hs.forEach((k,v)->IO.println(k+" => "+v));
						
					   for(Map.Entry<String,Integer> e:hs.entrySet())
					   {
						   IO.println(e.getKey()+" => "+e.getValue());
					   }
					   
//					   for(String k:hs.keySet())
//					   {
//						   IO.println(k+" => "+hs.get(k));
//					   }
					}
				}
				
				case 6->
				{
					if(hs.isEmpty())
					{
						System.out.println("Student is not available.");
					}
					else
					{
						String topper="";
						int max=Integer.MIN_VALUE;
						for(Map.Entry<String ,Integer> entry:hs.entrySet())
						{
							if(entry.getValue()>max)
							{
								max=entry.getValue();
								topper=entry.getKey();
										
							}
						}
						System.out.println("Topper: "+topper+" => "+max);
						
					}
				}
				
				case 7->
				{
					if(hs.isEmpty())
					{
						System.out.println("Student is not available.");
					}
					else
					{
						String lower="";
						int min=Integer.MAX_VALUE;
						for(Map.Entry<String ,Integer> entry:hs.entrySet())
						{
							if(entry.getValue()<min)
							{
								min=entry.getValue();
								lower=entry.getKey();
										
							}
						}
						System.out.println("Lower Score: "+lower+" => "+min);
						
					}
				}
				
				case 8->
				{
					int sum=0;
					for(Map.Entry<String ,Integer> entry:hs.entrySet())
					{
						sum=sum+entry.getValue();
					}
					
					System.out.println("Total Marks: "+sum);
					
					double average=(double)sum/hs.size();
					
					System.out.println("Average Marks: "+average);
				}
				
				case 9->
				{
					System.out.println("Existing... Thank you!");
					
				}
				
				
			}
			
			
		}
		
		

	}

}
