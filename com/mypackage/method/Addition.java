package com.mypackage.method;

public class Addition {
	public static void main(String[] args) {
		int a= 19;
		int b =5;
		int c =add(a,b); // a and b are actual parameters
		System.out.println("The sum of a and b is = "+c);
	}
// user defined method
	
	private static int add(int n1, int n2) //n1 and n2 formal parameter
	{
		int s;
		s=n1+n2;
		
		return s;
	}

}
