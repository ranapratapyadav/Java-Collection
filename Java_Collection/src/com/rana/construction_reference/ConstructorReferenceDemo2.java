package com.rana.construction_reference;

import java.util.function.Supplier;

class Accept
{
	public Accept()
	{
		System.out.println("No arrgument constriuctor.");
	}
	
	public void greed()
	{
		System.out.println("Hello batch 53.");
	}
}

public class ConstructorReferenceDemo2 {

	public static void main(String[] args) {
		Supplier<Accept>fn1=Accept::new;
		Accept ac=fn1.get();
		ac.greed();

	}

}
