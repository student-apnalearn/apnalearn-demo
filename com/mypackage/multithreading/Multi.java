package com.mypackage.multithreading;

public class Multi extends Thread {
	public void run() {
		System.out.println("thread is running..."+ Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.start();
		Multi t2 = new Multi();
		t2.start();
	}
}
