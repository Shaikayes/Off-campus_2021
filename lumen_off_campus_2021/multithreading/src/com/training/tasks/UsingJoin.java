package com.training.tasks;

public class UsingJoin {

	public static void main(String[] args) {
		
		
		System.out.println("Starting Main");
		
		
		Runnable target = new ReadFromConsole();
		
		
		Thread t1 = new Thread(target);
		
		t1.start();
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End Main Method");
		

	}

}
