package com.mypackage.method;

public class InstanceMethodExample {

	public static void main(String[] args) {
	
		InstanceMethodExample obj = new InstanceMethodExample();
		  System.out.println("The sum is :" +obj.add(12,13));

	}

	public int add(int a, int b) {
		int s;
		s=a+b;
		return s;
		
	}
}
