package com.rana.array;
/*
 Problem Title: In-Place Left Rotation of an Array by One
Problem Statement:
Write a Java program that reads an array of integers from the user and performs a left rotation by one position.
In a left rotation, the first element moves to the end, and all other elements shift one position to the left.

The rotation must be done in-place, meaning no extra arrays should be used.

Input Format:
An integer n representing the size of the array.

n space-separated integers representing the array elements.

Output Format:
Print the array after performing the left rotation by one position, with elements separated by a space.


Sample Input:

Enter size of array: 5
Enter 5 integers:
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50
Sample Output:

Array after left rotation:
20 30 40 50 10

Let me know if you'd like to add:

Multiple rotations (k positions)

Examples
Example 1
Input:
4
1
2
3
4
Output:
Array after left rotation:
2 3 4 1
 */
public class InplaceLeftRotate
{
    public static void main(String [] args)
    {
        int size=Integer.parseInt(IO.readln("Enter the size of  the array:"));
        int []arr=new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(IO.readln("Enter the element of array:"));
        }

        int temp=arr[0];
        for(int i=1,k=0;i<arr.length;i++)
        {
            arr[k++]=arr[i];
        }
        arr[arr.length-1]=temp;

        IO.println("Array after left rotation:");
        for(int i=0;i<size;i++)
        {

        IO.print(arr[i]+" ");
        }
    }
}
