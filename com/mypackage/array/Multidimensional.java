package com.mypackage.array;

public class Multidimensional {
	public static void main(String[] args) {
		int arr1[][] = new int[3][3] ;
		arr1[0][0]=10;
		arr1[1][1]=60;
		arr1[2][0]=70;
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1.length; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
		System.out.println();	
			
		}
	}

}
