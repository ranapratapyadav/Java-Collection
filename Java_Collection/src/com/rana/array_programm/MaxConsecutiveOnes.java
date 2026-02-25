package com.rana.array_programm;
/*
 Given an array that contains only 0s and 1s, find the longest sequence of consecutive 1s in the array."
->Take an array as input from user contains only 1 and 0
->Count how many 1s appear together without any 0 in between
->Print the maximum count of Consecutive Ones

Examples
Example 1
Input:
Enter the size of array (only 0s and 1s): 7
Enter 7 elements (0 or 1 only):
1 1 0 1 1 1 0
Output:
Array: 1 1 0 1 1 1 0 
Maximum consecutive 
 */
public class MaxConsecutiveOnes
{
    public static void main(String[] args)
    {
        int size=Integer.parseInt(IO.readln("Enter the size of the arr:"));
        int []arr=new int[size];
       

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(IO.readln("Enter the element:"));
        }

        IO.print("Given Array: ");
        for(int i=0;i<arr.length;i++)
        {
            IO.print(arr[i]+" ");
        }

            int count=0;
            int consecutive=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==1){
           count++;
           if(count>consecutive)
                consecutive=count;
           }
        
           else
           {
            
            count=0;
           }
          
          

        }
        IO.println("\nMaximum consecutive ones: "+consecutive);
        
    }
}
