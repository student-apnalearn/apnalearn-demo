package com.mypackage.staticv;

public class Bike9 {
	final int speed = 900;

	void run() {
		//speed = 400;
		System.out.println(speed);
	}

	public static void main(String[] args) {

		Bike9 obj = new Bike9();
		obj.run();
	}
}
