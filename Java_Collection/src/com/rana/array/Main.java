package com.rana.array;

import java.util.Scanner;

class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter how many student record :");
			int num=sc.nextInt();
			Student[] student=new Student[num];
			for (int i = 0; i < student.length; i++) 
			{
				System.out.println("Enter student id:");
				int sid=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student name:");
				String name=sc.nextLine();	
				student[i]=new Student(sid, name);
				
			}
			System.out.println("St");
			for(Student students:student)
			{
				System.out.println(students);
			}
		}
	}
}
