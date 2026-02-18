package com.rana.array;

import java.util.Scanner;

public class EmployeeArrayObject {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size:");
			int size=Integer.parseInt(sc.nextLine());
			Employee[]emp=new Employee[size];
			
			for(int i=0;i<emp.length;i++)
			{
				System.out.println("Enter the id: ");
				int id=Integer.parseInt(sc.nextLine());
				System.out.println("Enter the name:");
				String name=sc.nextLine();
				System.out.println("Enter the salary:");
				double salary=Double.parseDouble(sc.nextLine());
				
				emp[i]=new Employee(id, name, salary);
			}
			
			for (int i = 0; i < emp.length; i++)
			{
				System.out.println(emp[i]);
			}
			System.out.println();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
