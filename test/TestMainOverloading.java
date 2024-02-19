package test;

public class TestMainOverloading {
	public static void main(String args) {
		System.out.println("main with String[]");
	}			
	public static void main(String[] args) {
		System.out.println("main  String");	
	}
	public static void main() {
		System.out.println("main without args");
	}
}
