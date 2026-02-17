package com.rana.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the array element at:"+i+"th index");
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing the array element in reverse order:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		sc.close();

	}

}
