package com.rana.array;
/*
 Problem: Move All Zeros to the End
Problem Statement:
Write a Java program that moves all the zeros in an array to the end, while maintaining the relative order of non-zero elements.

Your program must:

Accept 5 test cases from the user.

For each test case:

Read the array size.

Accept the elements of the array.

Display the original array.

Move all zeros to the end of the array.

Print the modified array.

Input Format:
For each test case:

Second line contains n integers (both zero and non-zero values).

Output Format:
For each test case:

Print "Original Array: " followed by the input array.

Then print "After Moving Zeros to End: " followed by the modified array.

Examples
Example 1
Input:
5
0
1
0
3
12
Output:
Original Array: 0 1 0 3 12 
Array After Moving Zeros to End: 1 3 12 0 0
 */

public class MoveZerosToEnd
{
    public static void main(String[] args)
    {
        int size=Integer.parseInt(IO.readln("Enter the size of the array:"));
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(IO.readln("Enter the element of the array:"));
        }
        IO.print("Original Array: ");
        for(int i=0;i<arr.length;i++)
        {
            IO.print(arr[i]+" ");
        }

        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    break;
                }
            }
        }
        }
        IO.print("\nArray After Moving Zeros to End: ");
        for(int i=0;i<arr.length;i++)
        {
            IO.print(arr[i]+" ");
        }
    }
}
