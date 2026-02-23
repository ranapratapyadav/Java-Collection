package com.rana.array_programm;

import java.util.Scanner;

public class FindDuplicate {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		sc.nextLine();
		
		int []array=new int[size];
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Enter the element:");
			array[i]=sc.nextInt();
		}
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]==array[j] && i!=j)
				{
					System.out.println("Duplicate Element in the array"+array[j]);
					
					
				}
			}
		}
	}

}
