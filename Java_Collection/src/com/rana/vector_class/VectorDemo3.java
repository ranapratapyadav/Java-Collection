package com.rana.vector_class;

import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>(100);
		for(int i=0;i<100;i++)
		{
			v1.add(i);
		}
		
		IO.println("Capacity of collection"+v1.capacity());
		IO.println("Size of the collection"+v1.size());
		
		v1.add(999);
		IO.println("Capacity of collection"+v1.capacity());
		IO.println("Size of the collection"+v1.size());
		

	}

}
