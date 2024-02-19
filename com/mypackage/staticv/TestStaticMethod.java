package com.mypackage.staticv;
class Student {
	int rollno;
	String name;
	static String college="ITS";
	
	static void change() {
		college="BBDIT";
	}
	
	public Student(int r,String n) {
		
		rollno=r;
		name =n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class TestStaticMethod{
	public static void main(String[] args) {
		Student.change();
		Student S1=new Student(111,"Karan");
		Student S2=new Student(222,"Aryan");
		Student S3=new Student(333,"Sonoo");
		
		S1.display();
		S2.display();
		S3.display();
		
		
	}
		
}


