package com.mypackage.array;

class TestArrayCopyDemo {
	public static void main(String[] args) {
		//declaring a source array
		char[] arr3 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		//declaring a destination array
		char[] arr4 = new char[7];
		//copying array using System.arraycopy() method
		System.arraycopy(arr3, 2, arr4, 0, 7);
		for (char c : arr4) {
			System.out.println(c);
			
		}
		//printing the destination array
		System.out.println(String.valueOf(arr4));
		
		
		
		
		
		
	}
}