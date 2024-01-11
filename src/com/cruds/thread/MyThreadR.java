package com.cruds.thread;

public class MyThreadR implements Runnable{

	Thread t;
	
	MyThreadR(String name)
	{
		t = new Thread(this, name);
		t.start();
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
