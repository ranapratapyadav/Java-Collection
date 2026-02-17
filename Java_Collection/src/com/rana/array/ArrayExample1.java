package com.rana.array;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) 
	{
		int [] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//Using Ordinary for loop for printing the element
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("========================");
		
		int [] arr1=new int[] {100,200,300};
		
		//Using for each loop to print the array
		for (int a:arr1)
		{
			System.out.println(a);
		}
		
		System.out.println("====================================");
		
		int [] arr2= {1000,2000,3000};
		
		System.out.println(Arrays.toString(arr2));
		
		

	}
}