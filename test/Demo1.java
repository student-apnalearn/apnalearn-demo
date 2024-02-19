package test;
 class Demo2{
	int a =5;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if(a>0) {
		this.a = a;
		}
	}
		
	
}

public class Demo1 {
	public static void main(String[] args) {
		Demo2 obj =new Demo2();
		obj.setA(-5);
		System.out.println(obj.getA());
	}
	 

}
