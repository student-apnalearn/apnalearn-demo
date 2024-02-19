package com.mypackage.operator;

public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		// = , += , -= , *= , /= , %= , ^=
		int a = 10;
		System.out.println(a);
		/*a += 10;//a = a+10;
       System.out.println(a);
       a ^= 2;//a = a^2;
       System.out.println(a);
       a %= 3;//a = a%3;
       System.out.println(a);*/
		// ==, != , < , >, <= , >=
		int b = 10;
		int c = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(b > c);
		System.out.println(b < c);
		System.out.println(b <= a);
		System.out.println(a >= c);
		System.out.println(2<<1);
	}
}