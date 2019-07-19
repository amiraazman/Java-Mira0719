package com.miraazman.sample;

public class TestThread extends Thread {
	
	
	@Override
	public void run(){
		
		try{
			
			long l = (long)(Math.random() * 1000);
			System.out.println("I am a new thread running "+ this.getName() + " number: "  + l);
			Thread.sleep(2000);
			System.out.println("I am just awaken " + this.getName() + " number: " + l);
		}
		
		catch (InterruptedException ex){
			ex.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThread t1 = new TestThread();
		t1.setPriority(MIN_PRIORITY);
		TestThread t2 = new TestThread();
		t2.setPriority(NORM_PRIORITY);
		TestThread t3 = new TestThread();
		t3.setPriority(MAX_PRIORITY);
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
