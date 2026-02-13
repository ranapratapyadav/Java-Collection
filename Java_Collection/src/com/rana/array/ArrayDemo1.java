package com.rana.array;

//import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter the size: ");
		    int num=sc.nextInt();		
		    int[] arr=new int [num]; 
		    System.out.print("Enter the number:");
		    for (int i = 0; i < arr.length; i++) 
		    {
		    		arr[i]=sc.nextInt();
			}
		    System.out.println("Array element is:");
		
		for(int arrs:arr) 
		{
			System.out.print(","+arrs);
		}
		}

	}

}
