package com.rana.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("How many subject:");
			int noOfSubject=sc.nextInt();
			int [] marks=new int[noOfSubject];
			
			//initialize the array variable
			for (int i = 0; i < marks.length; i++) 
			{
				System.out.println("Enter the marks of subject");
				marks[i]=sc.nextInt();
			}
			
			//Addining the all marks
			int total=0;
			for(int marks1:marks)
			{
				total=total+marks1;
			}
			System.out.println("Total marks:"+total);
			
			double average=total/noOfSubject;
			System.out.println("Average of marks:"+average);
		}
		catch (NegativeArraySizeException e) 
		{
			System.out.println("Array size must be in positive.");
		}
		
		catch (InputMismatchException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}	

	}

}
