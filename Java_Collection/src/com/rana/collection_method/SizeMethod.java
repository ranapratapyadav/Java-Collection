package com.rana.collection_method;

import java.util.ArrayList;
import java.util.List;

public class SizeMethod {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(12);
		list.add(32);
		list.add(63);
		list.add(89);
		list.add(31);
		
		int li=list.size();
		System.out.println(list);
		System.out.println("Size of the collection : "+li);

	}

}
