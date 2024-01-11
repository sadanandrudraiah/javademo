package com.cruds.thread;

public class MainThreadDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread());

	}

}
