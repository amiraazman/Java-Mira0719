package com.miraazman.sample;

public class TestThread extends Thread {

	@Override
	public void run(){
		
		System.out.println("I am a new thread running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		TestThread t4 = new TestThread();
		TestThread t5 = new TestThread();
		
		
		//make it runnable
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
