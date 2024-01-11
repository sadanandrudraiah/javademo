package com.cruds.thread;

public class PriorityDemo {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker low = new Clicker(Thread.NORM_PRIORITY - 2);
		
		hi.start();
		low.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		hi.stop();
		low.stop();
		
		System.out.println("HI COUNT==>" + hi.count);
		System.out.println("LOW COUNT==>" + low.count);
		
	}

}
