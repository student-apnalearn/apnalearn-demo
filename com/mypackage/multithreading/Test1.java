package com.mypackage.multithreading;
//Creating a Java Thread Using Runnable Interface

/*Steps To Create A Java Thread Using Runnable Interface:
1.Create a class and implement the Runnable interface by using the implements keyword.
2.Override the run() method inside the implementer class.
3.Create an object of the implementer class in the main() method.
4.Instantiate the Thread class and pass the object to the Thread constructor.
5.Call start() on the thread. start()will call the run()method.*/

class t1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Test1 {
	public static void main(String[] args) {
		t1 obj1 = new t1();
		Thread t = new Thread(obj1);
		t.start();
	}
}