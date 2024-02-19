
package basic;
//Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
	public static void main(String[] args) throws IOException {

		//Enter the data using BufferReader
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

		//Input FROM USER 
		System.out.println("Enter any ");

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name); 


	}

}
