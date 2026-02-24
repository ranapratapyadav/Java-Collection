package com.rana.method_reference;

interface Worker1
{
	void work(double price);
}

class Employee1
{
	public static void salary(double salary)
	{
		System.out.println("Employee working with "+salary+" salary");
	}
}

public class StaticMethodReference {

	public static void main(String[] args) 
	{
		Worker1 w1=Employee1::salary;
		w1.work(50000);
	}

}
