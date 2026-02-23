package com.rana.array_programm;

import java.util.Scanner;

//Q2) How to sort Array elements using nested for loop.

public class SortedArray {

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
			for (int j = 0; j < array.length; j++) 
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		sc.close();
	}
	
}
