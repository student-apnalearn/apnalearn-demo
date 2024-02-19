package com.mypackage.array;
import java.util.Arrays;
public class ArrayDemo3 {
	public static void main(String[] args) {
		//1. declaration and instantiation
		int arr[] = new int[5];
		//2.1 declaration
		int arr1[];
		//2.2 instantiation
		arr1 = new int[5];
		//initialization
		arr[0] = 10;//ex. arr1[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//3. single line declaration, instantiation and initialization
		int arr2[] = {60, 70, 80, 90, 100};
		//type 1 iteration using normal for loop
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//type 2 iteration using for each loop
		for(int a : arr2) {
			System.out.println("arr2[]" + a);
		}
		//declaring new array with same size of source array
		int arr3[] = new int[arr2.length];
		//copy by index to index
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		for(int a : arr3) {
			System.out.println("arr3[]" + a);
		}
		//copy array using clone method
		int arr4[] = arr3.clone();
		for(int a : arr4) {
			System.out.println("arr4[]" + a);
		}
		//copy by specific index using System.copyArray() method
		int arr5[] = new int[3];
		System.arraycopy(arr4, 1, arr5, 0, 3);
		for(int a : arr5) {
			System.out.println("arr5[]" + a);
		}
		//copy by specific index using Arrays.copyOfRange() method
		int arr6[] = Arrays.copyOfRange(arr4, 1, 4);
		//arr4.length
		//starts from 1 index,
		//end to, 3rd argument value - 1
		for(int a : arr6) {
			System.out.println("arr6[]" + a);
		}
		printArray(arr3);
		//new ArrayDemo3().displayArrayElements(arr4);
		ArrayDemo3 obj = new ArrayDemo3();
		obj.displayArrayElements(arr4);
	}
	static void printArray(int arr[]) {
		for(int a : arr) {
			System.out.println("1 " +a);
		}
	}
	void displayArrayElements(int arr[]) {
		for(int a : arr) {
			System.out.println(a);
		}
	}
}