package com.mypackage.collection1;

import java.util.HashMap;
import java.util.Map;

// HashMap with Custom class Object as key in Java.



public class CollectionDemo4Map3 {
	public static void main(String[] args) {
		Map<Student ,String> map = new HashMap<>();
        map.put(new Student(1,"Shiv",29), "Singer and Trainer");
        map.put(new Student(2,"Mayur",21), "Dancer and cricket");
        map.put(new Student(3,"Yogesh",29), "Playing flute and facing");
        map.put(new Student(4,"Sushant",24), "Drawing");
        map.put(new Student(5,"Pralhad",28), "Cricket");
        map.put(new Student(6,"Shiv",29), "Swimmer and TT Player");
       
       System.out.println(map);
	}
}

class Student{
	int id;
	String name;
	int age;
	
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
     	    return true;	
		
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id; 
		this.name = name;
		this.age = age;
	
		
		
		
	}
	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	 

}
