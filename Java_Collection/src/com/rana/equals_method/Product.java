package com.rana.equals_method;

public class Product 
{
	private int productId;
	private String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
    @Override

	public boolean equals(Object object) {
		if(this==object)
		{
			return true;
		}
		if(object==null)
		{
            System.out.println("Cannot compare Product with a null object.");

			return false;
		}
		if (!(object instanceof Product)) {
	            System.out.println("Cannot compare Product with a different object type: " + object.getClass().getSimpleName());
	            return false;
	        }
		 
		// 3. Cast the object to the correct type
	    Product p = (Product) object;
        // Step 5: compare content
        return this.productId == p.productId &&
               this.productName.equals(p.productName);


	    	}
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + productId;
        hash = 31 * hash + (productName == null ? 0 : productName.hashCode());
        return hash;
    }}
