package com.mypackage.loop;
public class ForLoopDemo {

	public static void main(String[] args) {
		for(int i=1;i<= 100;i++){
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
       System.out.println("Through While loop");
       int i =1;
       while(i<= 100) {
    	   if(i%2 ==1) {
    		   System.out.println(i);
    	   }
    	   i++;
       }
	}

}
