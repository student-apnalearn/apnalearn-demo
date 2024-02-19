package com.mypackage.array;

public class Jaggged 
{
	public static void main(String[] args)
	{
		// Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];

		// Initializing the arrays of jagged arrays

		// First row has 4 columns
		arr[0] = new int[4];

		// Second row has 5 columns
		arr[1] = new int[5];

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++)   //For Rows
		{
			for (int j = 0; j < arr[i].length; j++)   //For Columns
			{
				arr[i][j] = count++;
			}
		}

		// Displaying the values of 2D Jagged array
		System.out.println("Elements of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}



