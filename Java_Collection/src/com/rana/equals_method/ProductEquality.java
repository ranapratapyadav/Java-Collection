package com.rana.equals_method;

public class ProductEquality {

	public static void main(String[] args) 
	{
		    Product p1 = new Product(101, "Laptop");
	        Product p2 = new Product(101, "Laptop");

	        boolean result = p1.equals(p2);

	        if (result) {
	            System.out.println("Products are equal based on content.");
	        } else {
	            System.out.println("Products are not equal.");
	        }

	        // Comparing with different object type
	        String str = "Hello";
	        p1.equals(str);

	}

}
