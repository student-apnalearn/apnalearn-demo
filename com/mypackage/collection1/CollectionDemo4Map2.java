package com.mypackage.collection1;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemo4Map2 {
	public static void main(String[] args) {
		Map<String ,Object> map = new HashMap<>();
		map.put("name", "PralhadN");
		map.put("age", 25);
		map.put("ID", 1);
		map.put("number","9710392718");
		
		//when same key with different value it replaces the value for the key
		map.put("name", "Pralhad");
		
		//when same key is available, so not to create any entry as putIfabsent
		
		map.putIfAbsent("ID", 2);
		map.putIfAbsent("Mobile", "I-phone");
		map.putIfAbsent("null", "abc");
		
		map.putIfAbsent("null", "xyz");
		
		
		System.out.println(map);
		
	}

}
