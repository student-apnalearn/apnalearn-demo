package com.mypackage.staticv;

public class A2 {
	static {
		System.out.println("Static block in invoked");
	}

	public static void main(String[] args) {
		System.out.println("Hello Main");
	}
}
