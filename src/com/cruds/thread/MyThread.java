package com.cruds.thread;

public class MyThread extends Thread {

	MyThread(String name)
	{
		super(name);
		start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " START==>");
		for(int i=5; i>=0; i--)
		{
			System.out.println(Thread.currentThread() + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread() + " END<<==");
	}
}
