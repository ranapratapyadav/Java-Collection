package com.rana.array_programm;

//Q4) Find the second largest element in the array.

public class SecondLargest {

	public static void main(String[] args) 
	{
		int[] array1= {12,21,54,36};
		
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = i+1; j < array1.length; j++) 
			{
				if(array1[i]>array1[j])
				{
					int temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
						
			}
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Second highest element in the array  "+array1[1]);

	}

}
