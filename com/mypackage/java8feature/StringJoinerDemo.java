package com.mypackage.java8feature;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(",");
		s.setEmptyValue("This is me");
		s.add("Pralhad");
		s.add("Rahul");
		System.out.println(s.toString());
	}

}
