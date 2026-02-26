package com.rana.collection_method;

import java.util.ArrayList;
import java.util.List;

public class ContainDemo {

	public static void main(String[] args) 
	{
        List list=new ArrayList();
		
		list.add(12);
		list.add(32);
		list.add(63);
		list.add(89);
		list.add(31);
		
		list.contains(89);
		System.out.println(list.contains(89));

	}

}
