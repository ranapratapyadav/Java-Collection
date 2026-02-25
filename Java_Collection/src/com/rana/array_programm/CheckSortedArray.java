package com.rana.array_programm;
/*
 Write a program to check whether the given array is arranged in increasing order or not. The array is considered sorted other wise not sorted
->Take an array as input from user
->Compare each element with its next element
->Print true if sorted, false if not sorted

Examples
Example 1
Input:
Enter the size of array: 5
Enter 5 elements:
1 2 3 4 5
Output:
Array: 1 2 3 4 5 
Is sorted? true
 */

public class CheckSortedArray
{
    public static void main(String [] args)
    {
        int size=Integer.parseInt(IO.readln("Enter the size of the array:"));
        int []array=new int[size];

        for(int i=0;i<array.length;i++)
        {
            array[i]=Integer.parseInt(IO.readln("Enter the element:"));
        }

        boolean flag=true;

        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]>array[i+1])
            {
                flag=false;
                break;
            }
        }
        IO.print("Given Array: ");
        for(int i=0;i<array.length;i++)
        {
            IO.print(array[i]+" ");
        }
        IO.println();
        IO.print("Is sorted? ");
        if(flag)
        {
            IO.println("true");
        }
        else{
            IO.println("false");
        }
    }
}
