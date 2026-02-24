package com.rana.array_programm;

/*
 Q6) Two sum problem.
    int[] arr = {2, 7, 11, 15};
    int target = 9;

    Output : Pair found: 2 , 7
 */

public class TwoSumProblem {

	public static void main(String[] args) 
	{
		int[] arr = {2, 7, 11, 15};
	    int target = 9;
	    
	    for (int i = 0; i < arr.length; i++) 
	    {
			for (int j = 1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("Pair found: "+arr[i]+","+arr[j]);
				}
			}
		}


	}

}
