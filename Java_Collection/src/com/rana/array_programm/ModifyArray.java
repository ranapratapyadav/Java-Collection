package com.rana.array_programm;

//Q1) WAP to modify the value of an array.[Change Array Element]


import java.util.Scanner;

public class ModifyArray {

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
			System.out.println(array[i]+5);
		}
		sc.close();
	}

}
