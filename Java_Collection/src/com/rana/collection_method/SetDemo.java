package com.rana.collection_method;


import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add(12);
		s1.add(34);
		s1.add(75);
		s1.add(56);
		s1.add(12);
		System.out.println(s1);
		
		
		

	}

}
