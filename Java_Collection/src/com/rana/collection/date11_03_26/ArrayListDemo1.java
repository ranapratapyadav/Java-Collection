package com.rana.collection.date11_03_26;

/*
 program to store elements in an ArrayList and remove duplicate elements using Collections / ArrayList methods, without using Set.

Examples
Example 1
Input:
6
10 20 10 30 20 40
Output:
ArrayList after removing duplicates: [10, 20, 30, 40]
 */


import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo1
{
    public static void main()
    {
        ArrayList <Integer>al=new ArrayList<Integer>();

        int size=Integer.parseInt(IO.readln("Enter the Array list element:"));

        for(int i=0;i<size;i++)
        {
            int number=Integer.parseInt(IO.readln("Enter the element of the arraylist :"));
            al.add(number);
        }

        IO.println("Original ArrayList: "+al);

         Object []array=al.stream()
            .distinct()
                .toArray();

        IO.println("ArrayList after removing duplicates: "+Arrays.toString(array));


    }
} 
