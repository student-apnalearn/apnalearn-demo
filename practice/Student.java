package practice;

public class Student {
	private String name;
	private int  rollNumber;
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.rollNumber);
		
	}
     
	//Getter
	public int getRollNumber() {
		return rollNumber;
	}
	
    //setter
	public void setRollNumber(int rollNumber) {
		if(rollNumber<=0) {
		throw new IllegalArgumentException("Invalid Args");
		}	
		this.rollNumber = rollNumber;
	}

}
