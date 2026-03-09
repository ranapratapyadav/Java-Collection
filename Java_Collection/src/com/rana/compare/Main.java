package com.rana.compare;


import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        ArrayList<Customer>listOfCustomer=new ArrayList<>();
        listOfCustomer.add(new Customer(1,"Rana Pratap",8978D));
        listOfCustomer.add(new Customer(5,"Sanoj yadav",5645D));
        listOfCustomer.add(new Customer(3,"Rahul raj Yadav",2136D));
        listOfCustomer.add(new Customer(2,"Deepak Yadav",5489D));
        listOfCustomer.add(new Customer(4,"shivam Yadav",9876D));

       for(Customer customer:listOfCustomer)
       {
        IO.println(customer);
       }

        //Annonymous Inner Class
        // A.Sort based on customerNumber 
       Comparator<Customer> cmpId=new Comparator<>()
       {      
            public int compare(Customer c1,Customer c2) 
            {
                return Integer.compare(c1.getCustomerNumber(),c2.getCustomerNumber());
            }
       };

       Collections.sort(listOfCustomer,cmpId);
       IO.println("Sorted Customer data based on customerNumber:");

       for(Customer cust:listOfCustomer)
       {
        IO.println(cust);
       }



       //B sort based  on customer name

       Comparator<Customer> custName=new Comparator<>()
       {
            public int compare(Customer c3,Customer c4)
            {
                return c3.getCustomerName().compareTo(c4.getCustomerName());
            }
       };

        IO.println("Sorted based on customer name.");
       Collections.sort(listOfCustomer,custName);
       for(Customer cust:listOfCustomer)
       {
        IO.println(cust);
       }


       //3.sorting based on the customer customerBill
       Collections.sort(listOfCustomer,(c5,c6)->Double.compare(c5.getCustomerBill(),c6.getCustomerBill()));

       IO.println("Sorting based on customer bill");

       for(Customer cust:listOfCustomer)
       {
        IO.println(cust);
       }

    }
}











class Customer
{
    private Integer customerNumber;
    private String customerName;
    private Double customerBill;


    public Customer(Integer customerNumber,String customerName,Double customerBill)
    {
        this.customerNumber=customerNumber;
        this.customerName=customerName;
        this.customerBill=customerBill;
    }


    //write getter method

    public Integer getCustomerNumber()
    {
        return this.customerNumber;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public Double getCustomerBill()
    {
        return this.customerBill;
    }

    public String toString()
    {
        return "[" +this.customerNumber+" "+this.customerName+" "+this.customerBill+"]";
    }


} 