package com.rana.vector_class;


import java.util.Collections;
import java.util.Vector;

record Product (Integer id,String name,Double price) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p1) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, p1.id);
	}
	
}

public class VectorDemo2 {

	public static void main(String[] args) 
	{
		Vector<Product> v1=new Vector<Product>();
		v1.add(new Product(111, "LAptop", 32548D));
		v1.add(new Product(333, "Tablet", 39848D));
		v1.add(new Product(555, "Hardisk", 32238D));
		v1.add(new Product(222, "Camera", 31848D));
		v1.add(new Product(444, "Mobile", 39998D));
		
		
		IO.println("Original Data");
		for (Product product1 : v1) 
		{
			IO.println("Original Data"+product1);
		}
		
		
		Collections.sort(v1);
		IO.println("After the sorted Data Based on id:");

		for (Product product2 : v1) 
		{
			IO.println(product2);
		}
		

	}

}
