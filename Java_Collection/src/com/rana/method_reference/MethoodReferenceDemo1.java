package com.rana.method_reference;


interface Worker
{
	void work();
}

class Employee
{
	public void work()
	{
		System.out.println("Employee is working.");
	}
}

public class MethoodReferenceDemo1 {

	public static void main(String[] args) 
	{
		//Lambda Expression
		Worker w1=()->System.out.println("Worker is working.");
		w1.work();
		
		//method reference
		Worker w2=new Employee() :: work;
		w2.work();
	}

}
