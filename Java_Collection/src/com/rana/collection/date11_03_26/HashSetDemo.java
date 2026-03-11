package com.rana.collection.date11_03_26;


/*
 The objective of this program is to accept multiple elements from the user, store them in a HashSet to ensure uniqueness, convert the HashSet into an array, and display all the array elements.

Examples
Example 1
Input:
Enter number of elements: 3
Java Programming
Data Structures
Operating Systems
Output:
Array Elements:
Java Programming
Data Structures
Operating Systems
 */


import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        int size=Integer.parseInt(IO.readln("Enter the number of element:\n"));

        HashSet<String> hs=new HashSet<>();

        for(int i=0;i<size;i++)
        {
            String name=IO.readln("Enter the Subject:");
            hs.add(name);
        }

        Object[] obj=hs.toArray();

        IO.println("Array Elements:");
        for(Object s:obj)
        {
            IO.println(s);
        }

    }
}
