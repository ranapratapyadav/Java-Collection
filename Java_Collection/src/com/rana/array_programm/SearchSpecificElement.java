package com.rana.array_programm;

import java.util.Scanner;

//Q3) WAP to search an element in the existing array.

public class SearchSpecificElement {

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
		
		int val=23;
		for (int i = 0; i < array.length; i++) 
		{
			if(val==array[i])
			{
				System.out.println("value matched");
				return;
			}
			else {
				System.out.println("not matched.");
			}
		}
		
		sc.close();
	}

}
