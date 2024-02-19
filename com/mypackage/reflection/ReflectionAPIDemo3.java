package com.mypackage.reflection;

import java.lang.reflect.Constructor;

public class ReflectionAPIDemo3 {
	public ReflectionAPIDemo3() {
		
	}
	 public ReflectionAPIDemo3(String name) {
		 
	 }
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		ReflectionAPIDemo3 demo = new ReflectionAPIDemo3();
		Class cls =demo.getClass();
		Constructor constrctr=cls.getConstructor();
		System.out.println(constrctr.getName());
		
	    Constructor constrctrs[]=cls.getConstructors();
	    for (Constructor constructor : constrctrs) {
	    	System.out.println(constructor.getName()+ ":::"+ constructor.getParameterCount());
			
		}	
	}
}
