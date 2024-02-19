package basic;
//Java program to take an integer
//as input and print it
import java.util.Scanner;

public class GFG {
	public static void main(String[] args) {
		int num;  // declare the variable
		
		//Input the integer
		System.out.println("Enter the integer: ");
		
		//Create the Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Read the next integer from Screen
		num=sc.nextInt();
		
		//Display the integer
		System.out.println("Entered integer is : "+ num);
		
		
	}
	

}
