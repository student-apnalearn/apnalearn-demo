package test;

class A{
	A(){
		System.out.println("Constructor A");
	}
}

class B extends A{
	B(){
		System.out.println("Constructor B");
	}
}


public class Demo3 extends B{
	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		System.out.println("Constructor Demo3");
		
	
	}

}


