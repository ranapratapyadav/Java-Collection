package com.rana.array;

import java.util.Scanner;


public class ProductArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("Enter the size.");
			int size=Integer.parseInt(sc.nextLine());
			
			Product[] pd=new Product[size];
			
			for (int i = 0; i < pd.length; i++) 
			{
				System.out.println("Enter the id:");
				int id=Integer.parseInt(sc.nextLine());
				System.out.println("Enter the name of prioduct:");
				String name=sc.nextLine();
				System.out.println("Enter the price:");
				double price=Double.parseDouble(sc.nextLine());
				pd[i]=new Product(id, name, price);
				
			}
			int piSearch=Integer.parseInt(IO.readln("Enter the product id:"));
			
			for(Product pid:pd)
			{
				if(pid.getId()==piSearch)
				{
					System.out.println("Product  found:");
					System.out.println(pid);
					System.exit(0);
				}
			}
			System.out.println("Product is not found.");
		}
		
	}
}
