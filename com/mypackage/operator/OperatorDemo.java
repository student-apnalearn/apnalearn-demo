package com.mypackage.operator;

public class OperatorDemo {
	public static void main(String[] args) {
		//Arithmetic Operator
		int a = 20, b = 10;
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a/b = " + (a/b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a%b = " + (a%b));
		
		//Unary Operator
		System.out.println("a++ = " + (a++));//it uses the current value, and then increment / decrement the value of the variable
		System.out.println("++a = " + (++a));//first it change the current value of the variable and then use it
		System.out.println("a-- = " + (a--));//print 22, end of the statement, it will decrease the value by 1 -> 21
		System.out.println("--a = " + (--a));//first it will decrease the value by 1, 21 -> 20, and then print it.
		//Logical Operator
		boolean flag = false;
		System.out.println("!flag = " + (!flag));
		if(a >= b) {
			System.out.println("AND = " + true);
		} else {
			System.out.println("AND = " + false);
		}
		if(a == b || a > b) {
			System.out.println("OR = " + true);
		} else {
			System.out.println("OR = " + false);
		}
		//Assignment Operator -- operator overloading(C++)
		//= , += , -= , *= , /= , %= , ^=
		int c = 5, d = 20;
		//d /= c;
		System.out.println("d /= c ==> " + d);
		System.out.println(b >> 1);
		System.out.println(b >> 2);
		System.out.println(b >> 3);
		System.out.println(b >> 4);
		System.out.println(b << 1);
		System.out.println(d > c ? "false" : "true");
		boolean flag1 = true, flag2 = false, flag3 = false;
		if (flag1 | flag2 | flag3) {
			System.out.println("if case");
		} else {
			System.out.println("else case");
		}
	}
}