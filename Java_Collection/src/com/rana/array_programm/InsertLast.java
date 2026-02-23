package com.rana.array_programm;

//Q5) Insert a new element in the array at last position.

public class InsertLast {

	public static void main(String[] args) 
	{
		int []array= {10,23,4,5};
		
		int [] array1=new int[array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			
		  array1[i]=array[i];
			
		
		}
		array1[array1.length-1]=12;
		for(int i=0;i<array1.length;i++) {
			IO.println(array1[i]);
		}
			
			

	}

}
