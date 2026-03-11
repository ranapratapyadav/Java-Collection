package com.rana.arraylist.sceneriobased;

import java.util.ArrayList;

public class CustomerService 
{
	  private ArrayList<Customer> customers  ; 
	 
	 public CustomerService()
	 {
		 customers  =new ArrayList<Customer>();
	 }
	 
	 public void addCustomer(Customer customer)
	 {
		 if(isFirstCustomer(customer)) 
		 {
			 customers.add(customer);
		 }
	 }
	 
	 private boolean isFirstCustomer(Customer customer)
	 {
	 	for (Customer c : customers)
	 	{
			if(c.phone().equals(customer.phone()))
			{
				return false;
			}
			
		} 
	 	return true;
	 }
	 
	 
	 public double calculateBill(Customer customer)
	 {
		double distance=customer.distance();
		//the customer is new customer 
		if(isFirstCustomer(customer))
		{
			return 0.0;
		}
		if(distance<=4)
		{
			return 80.0;
		}
		
		 return 80 + (distance - 4) * 6;
	 }
		
	 public String  printBill(Customer customer)
	 {
		 double bill=calculateBill(customer);
		 return customer.customerName()+" Please pay your bill of Rs."+bill;
	 }
}
