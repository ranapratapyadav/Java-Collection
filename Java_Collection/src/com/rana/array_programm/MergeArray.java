package com.rana.array_programm;

//Q2) Program to merge to array elements into a single array.

public class MergeArray {

	public static void main(String[] args) 
	{
		int[] array1= {12,21,54,36};
		int[] array2= {78,98,63,86};
		
		int [] newArray=new int[array1.length+array2.length];
		
		for (int i = 0; i < array1.length; i++)
		{
			newArray[i]=array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) 
		{
			newArray[array1.length+i]=array2[i];
		}

		for (int i = 0; i < newArray.length; i++) 
		{
			System.out.println(newArray[i]);
		}
	}

}
