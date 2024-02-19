package com.mypackage.Strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	  {
	    String original, reverse = "" ;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = sc.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse+ original.charAt(i);
	      sc.close();
	    System.out.println("Reverse of the string: " + reverse);
	  }
}
