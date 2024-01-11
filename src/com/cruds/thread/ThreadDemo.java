package com.cruds.thread;

public class ThreadDemo {

	public static void main(String[] args) {

	MyThread t1 = new MyThread("Child1");
	MyThreadR t2 = new MyThreadR("Runnable Child");
	try {
		t1.join();
		t2.t.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("MAIN THREAD EXIT");
	
	}

}
