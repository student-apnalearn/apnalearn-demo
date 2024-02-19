package com.mypackage.vector;

//Java code to illustrate capacity()
import java.util.*;

public class VectorDemo {
	public static void main(String args[]) {
		// Creating an empty Vector
		Vector<String> vec_tor = new Vector<String>(4);

		// Use add() method to add elements into the Vector
		vec_tor.add("Welcome");
		vec_tor.add("To");
		vec_tor.add("Geeks");
		vec_tor.add("4");
	//	vec_tor.add("Geeks");
  
		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);
		// Displaying the Vector size
				System.out.println("The Size is: " + vec_tor.size());

		// Displaying the capacity of Vector
		System.out.println("The capacity is: " + vec_tor.capacity());
	}
}
