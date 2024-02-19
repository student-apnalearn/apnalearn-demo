package com.mypackage.abstraction;
// java program for encapsulation
 class Employee {
	 private int empid;
	 public void setEmpid(int empid1) {
		empid = empid1;
	}
	 public int getEmpid() {
		return empid;
	}

	public static void main(String[] args) {
	Employee e = new Employee();
	e.setEmpid(110);
	System.out.println( e.getEmpid());
	}

}
