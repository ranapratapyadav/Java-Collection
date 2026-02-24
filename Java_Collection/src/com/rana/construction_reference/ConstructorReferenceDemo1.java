package com.rana.construction_reference;

import java.util.function.BiFunction;

class Customer
{
	private Integer id;
	private String name;
	
	//create constructor
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//create toString method
	@Override
	public String toString() {
		return " Customer[id=" + id + ", name=" + name + "]";
	}
	
	

	
}

public class ConstructorReferenceDemo1 
{
	public static void main(String[] args)
	{
		BiFunction<Integer,String,Customer>fn2=Customer::new;
		Customer c=fn2.apply(101,"Rana Pratap Yadav");
		System.out.println(c);
	}
}
