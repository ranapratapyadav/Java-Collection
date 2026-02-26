package com.rana.collection_method;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfDemo {

	public static void main(String[] args)
	{
		 List <Integer>list=new ArrayList <>();
			
			list.add(12);
			list.add(32);
			list.add(63);
			list.add(89);
			list.add(31);
			
			list.removeIf(arr-> arr % 2==0);
			System.out.println(list);
			

	}

}
