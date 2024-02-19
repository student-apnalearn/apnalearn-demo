package com.mypackage.exception;

public class MultipleCatchBlock4 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception occures");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occure");
		} catch (Exception e) {
			System.out.println("Parent Exception occure");
		}
        System.out.println("rest of the code");
	}
}
