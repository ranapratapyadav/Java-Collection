package com.rana.collection_method;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List li=new ArrayList();
		li.add(13);
		li.add(34);
		li.add(45);
		li.add(14);
		System.out.println(li);
		
		li.add(2, 89);
		System.out.println(li);

	}

}
