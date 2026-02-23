package com.rana.array_programm;

import java.util.Iterator;
import java.util.Scanner;

public class InsertMidPosition {

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
		
		int mid=(array.length)/2;
		
		for (int i = 0;i<=mid; i++) 
		{
			
		}

	}

}
