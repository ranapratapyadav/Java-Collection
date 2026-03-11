package com.rana.arraylist.sceneriobased;

public class CabCustomerServiceTester {

	public static void main(String[] args) 
	{
		Customer cust=new Customer(101, "Rana", "Faridabad", "Ammerpeth", 100, "7007889382");
//		Customer cust1=new Customer(102, "Rana", "Faridabad", "Ammerpeth", 100, "7007889382");

		
		CustomerService custServ=new CustomerService();
		
		custServ.addCustomer(cust);
		custServ.calculateBill(cust);
		IO.print(custServ.printBill(cust));
		

	}

}
