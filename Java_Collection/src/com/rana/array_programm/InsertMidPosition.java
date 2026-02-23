package com.rana.array_programm;
//Q6) Insert a new element in the array at middle position

import java.util.Scanner;

public class InsertMidPosition {

	
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
		
		int mid=(array.length)/2;
		int[] newArray=new int[size+1];
		
		for (int i = 0;i<mid; i++) 
		{
			newArray[i]=array[i];
		}
		newArray[mid]=13;
		
		for (int i = mid; i < size; i++) 
		{
			newArray[i+1]=array[i];
		}
		
		System.out.println("After insertion");
		for (int i : newArray) 
		{
			System.out.println(i);
		}
		
	}

}
