package com.rana.array;

import java.util.Scanner;

/*
 Take record if applicable :
----------------------------------------
Assignment 01 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Student.

Attributes/Properties/Fields [tightly encapsulated]

id, name and marks

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called StudentArrayDemo with main method.

Create Student array with size 3 manually.

Assign Student objects to array elements using index manually.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Student [id=101, name=Ravi, marks=89.5]
Student [id=102, name=Anita, marks=92.0]
Student [id=103, name=Kiran, marks=85.75]
 */

public class StudentArrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size.");
			int size=Integer.parseInt(sc.nextLine());
			Student [] std=new Student[size];
			for (int i = 0; i < std.length; i++) 
			{
				System.out.println("Enter the id : ");
				int id=Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the name :");
				String name=sc.nextLine();
				std[i]=new Student(id, name);
			}
			
			for (int i = 0; i < std.length; i++) 
			{
				System.out.println(std[i]);
			}
			System.out.println();
		}
		

	}

}
