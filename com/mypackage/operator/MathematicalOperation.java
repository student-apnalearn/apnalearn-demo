package com.mypackage.operator;

public class MathematicalOperation {
	public int addition(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiplication(int a, int b) {
		return a * b;
	}
	public int division(int a, int b) {
		return a / b;
	}
	public int reminder(int a, int b) {// parameter
		
		return a % b;
	}
	public void increament(int a, int b) {
		System.out.println("post increment :: " + a++);// post increment
		System.out.println(a);// post increment
		System.out.println("pre increment :: " + ++b);// pre increment
	}
	public void decreament(int a, int b) {
		System.out.println("post decrement :: " + a--);// post decrement
		System.out.println(a);// post increment
		System.out.println("pre decrement :: " + --b);// pre decrement
	}
	public boolean negation(boolean value) {
		return !value;// negation operator
	}
	public static void main(String[] args) {
		MathematicalOperation obj = new MathematicalOperation();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.subtract(30, 20));
		System.out.println(obj.multiplication(10, 20));
		System.out.println(obj.division(40, 20));
		System.out.println(obj.reminder(43, 20));
		obj.increament(43, 20);
		obj.decreament(43, 20);
		System.out.println(obj.negation(true));
		System.out.println(obj.negation(false));
	}
}