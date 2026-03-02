package com.rana.vector_class;

import java.util.Vector;

public class VectorDemo1 
{
	public static void main(String[] args) 
	{
		Vector<Integer>v1=new Vector<Integer>();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		
		
		//Adding all the element of the collection
		
		int sum=0;
		for (Integer number : v1) 
		{
			sum=sum+number;
			
		}
		IO.println("Sum of collection element:"+sum);
	}
}
