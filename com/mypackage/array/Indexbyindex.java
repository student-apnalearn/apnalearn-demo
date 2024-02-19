package com.mypackage.array;

public class Indexbyindex {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		for (int i : arr) {
			System.out.println(i);
		}
		int arr1[] = new int[arr.length];
		for(int i=0 ;i<arr.length ;i++) {
			arr1[i]=arr[i];
		}
		for (int c : arr1) {
			System.out.print(c);
		}
	}

}
