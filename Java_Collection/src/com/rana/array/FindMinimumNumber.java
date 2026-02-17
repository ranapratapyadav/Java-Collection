package com.rana.array;

import java.util.Scanner;

public class FindMinimumNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int [] arr=new int[size];
			
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println("Enter the element of the array: ");
				arr[i]=sc.nextInt();
				
			}
			FindMinimum.minValue(arr);
			
		}
		catch (NegativeArraySizeException e) 
		{
			System.out.println("Array size must iun positive:");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}


class FindMinimum
{
	public static void minValue(int[]arr)
	{
		int min= arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Min number of arr"+min);
	}
}
