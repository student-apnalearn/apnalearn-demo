package test;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		String nam;
		System.out.println("hello world ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name :  ");
		nam = sc.next();
		System.out.println(" Your Name is :  "+ nam);
		sc.close();
	}

}
