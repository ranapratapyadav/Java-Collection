package com.rana.array_programm;

//Q5) Find the second largest element in the array where array contains duplicate elements.


public class SecondLargerInDupArr {

	public static void main(String[] args) 
	{
		int []array= {12,34,54,32,45,67,89,32,45};
		
		for (int i = 0; i < array.length; i++) 
		{
			int count=0;
			for (int j = 0; j < array.length; j++) 
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(array[i]);
			}
		}
		System.out.println("Second Largest in this array"+array[1]);
	}

}
