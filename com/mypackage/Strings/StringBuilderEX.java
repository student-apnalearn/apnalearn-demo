package com.mypackage.Strings;

public class StringBuilderEX {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		sb.insert(2, 'n');
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		
		//delete the extra 'n'
		sb.delete(3, 5);
		System.out.println(sb);
		System.out.println(sb.length());
		
	}
}