package com.rana.array_programm;

//WAP to Remove Duplicates from array.
import java.util.Scanner;

public class RemoveDuplicate {

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
			int count=0;
			
			for (int j = 0; j < array.length; j++) 
			{
				if(array[i]==array[j] &&  i!=j)
				{
					count++;
					break;
				}				
				
			}
			if(count==0)
			{
				System.out.println((array[i]));
			}
		}
	}

}
