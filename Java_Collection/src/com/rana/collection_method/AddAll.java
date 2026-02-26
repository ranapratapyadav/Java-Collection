package com.rana.collection_method;

import java.util.Vector;

public class AddAll {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(15);
		v1.add(12);
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add(56);
		v2.add(56);
		v2.add(9);
		System.out.println(v2);
		
		v1.addAll(v2);
		
		System.out.println(v1);
		

	}

}
