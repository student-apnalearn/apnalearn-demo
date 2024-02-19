package com.mypackage.collection1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class CollectionDemoLinkedList1 {
	public static void main(String[] args) {
		List<String> list1 =new LinkedList<>();
		
		//adding element one 
		
		list1.add("Shiv");
		list1.add("Nikhil");
		list1.add("yogesh");
		list1.add("Mayur");
		System.out.println(list1);
		
		//adding a multiple elements;
		List<String> list2 =Arrays.asList("Mrunalee","Shushant","Pralhad","Shiv");
		
		//adding multiple elements from another location
		list1.addAll(list2);
		
		//iteration of the collection
		
		/*for (String value : list1) {
			
			System.out.println(value);
			
		} */
		
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}

}
