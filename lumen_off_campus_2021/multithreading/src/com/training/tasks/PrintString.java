package com.training.tasks;

public class PrintString {

	
	public PrintString() {
		
	}
	
	public synchronized static void print(String str1,String str2) {

		
	//	System.out.println(Thread.currentThread().getName());
		System.out.println(str1);
		
		
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  System.out.println(str2);
	}
}
