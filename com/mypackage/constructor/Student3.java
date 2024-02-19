package com.mypackage.constructor;

class Student3{ 
	int id;
	String name;

	//method to display the value of id and name 
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[]args) {
		//creating objects
		Student3 S1 = new Student3();
		Student3 S2 = new Student3();


		//displaying values of the object 
		S1.display();
		S2.display();
	}
}
