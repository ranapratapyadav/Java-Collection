package com.rana.array;

import java.util.Scanner;

class findMax
{
	public static void maxValue(int []arr)
	{
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max of the array:"+max);
	}
}




public class MaxElementOfArray {

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
				System.out.println("Enter the element of the array:");
				arr[i]=sc.nextInt();
			}
			findMax.maxValue(arr);
			
		}
		catch (NegativeArraySizeException e) 
		{
			System.err.println("Array size must be in positive.");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
