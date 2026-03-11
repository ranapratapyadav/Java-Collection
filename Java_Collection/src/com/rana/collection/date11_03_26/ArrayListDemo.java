package com.rana.collection.date11_03_26;

/*
 Problem Description
1) Write a java program to create an ArrayList of String objects, add several
names and then remove an element by its value & display ArrayList elements
before & after removing an element.

Examples
Example 1
Input:
Enter how many names you want to add: 4
Enter 4 names:
Ravi
Sita
Kiran
Anu
Enter a name to remove: Kiran
Output:
ArrayList before removing: [Ravi, Sita, Kiran, Anu]
ArrayList after removing: [Ravi, Sita, Anu] 
 */

import java.util.ArrayList;
public class ArrayListDemo
{
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        int size=Integer.parseInt(IO.readln("Enter the size of arrayList:"));
        for(int i=0;i<size;i++)
        {
            String name=IO.readln("Enter the element:");
            al.add(name);
        }

       IO.println("ArrayList before removing: "+al);
       String sname=IO.readln("Enter the element of array do you want to remove:");


       for(String s :al)
       {
        if(s.equals(sname))
        {
            al.remove(sname);
            break;
        }
       }
       
       IO.println("ArrayList after removing: "+al);


    } 
}
 
