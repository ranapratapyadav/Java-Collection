package com.rana.compare;

import java.util.*;
public class Main1
{
    public static void main(String[] args)
    {
        ArrayList<Product> listOfProduct=new ArrayList<>();
        listOfProduct.add(new Product(102,"Laptop",78958D));
        listOfProduct.add(new Product(101,"Camera",56958D));
        listOfProduct.add(new Product(105,"Mobile",25458D));
        listOfProduct.add(new Product(104,"Watch",73158D));
        listOfProduct.add(new Product(100,"Dextop",72658D));

        IO.println("Original Data of product");
        for(Product prd:listOfProduct)
        {
            IO.println(prd);
        }

        Collections.sort(listOfProduct);
        IO.println("Product data after sorting based on id.");

        for(Product pd:listOfProduct)
        {
            IO.println(pd);
        }
    }
}




class Product implements Comparable<Product>
{
    private Integer pId;
    private String pName;
    private Double pPrice;


    public Product(Integer pId,String pName,Double pPrice)
    {
        this.pId=pId;
        this.pName=pName;
        this.pPrice=pPrice;
    }


    //create getter method

    public Integer getPid()
    {
        return this.pId;

    }

    public String getPName()
    {
        return this.pName;
    }

    public Double getpPrice()
    {
        return this.pPrice;
    }


    public String toString()
    {
       return  "["+this.pId+" "+this.pName+" "+this.pPrice+"]";
    
    
    }

    public int compareTo(Product p1)
    {
        return this.pId-p1.pId;
    }
}