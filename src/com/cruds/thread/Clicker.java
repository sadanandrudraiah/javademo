package com.cruds.thread;

public class Clicker implements Runnable {

	long count = 0;
	Thread t;
	private volatile boolean running = true;
	
	Clicker(int priority)
	{
		t = new Thread(this);
		t.setPriority(priority);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " RUN METHOD");
		while(running)
		{
			count++;
		}
	}
	
	public void start()
	{
		t.start();
	}

	public void stop()
	{
		System.out.println(Thread.currentThread() + " STOP METHOD");
		running = false;
	}
}
