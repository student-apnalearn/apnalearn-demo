package com.mypackage.operator;

public class OperatorDemo1 {
	public static void main(String args[]) {
		int x = 5;
		int y = 10;
		System.out.println(x + y);//addition
		System.out.println("x+y");//simply it is just a string
		System.out.println("" + x + y);//concatenation
		System.out.println("5" + "10");//concatenation
		System.out.println(5 + 10 + x + y);//addition
		System.out.println("Output " + (x + y));
		System.out.println("Output " + x + y);//Output 510
		char a = 'Z';char b = 65;
		System.out.println(a);
		System.out.println((char)(b - 1));
		for (int i = 1; i <= 26; i++) {
			System.out.println((char)('@' + i) + " ::: " + (64 + i));
		}
		double value = (15-10)/2;//5/2 = 2.5
		System.out.println(value);
		System.out.println((double)(15-10)/2);
		System.out.println((15.0-10.0)/2.0);
	}
}