package com.training.tasks;

public class UsingThreads {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		//Runnable target = new PrintNumbers();
		
	
		Thread t1 = new Thread(new PrintNumbers(5,"Hello World"),"print5times");
		
		t1.start();
		
       Thread t2 = new Thread(new PrintNumbers(10,"Hello India"),"print10times");
		
		t2.start();
		
		
		Thread t3 = new Thread(new SumNumberTask(10),"Ten Count");
		
		Thread t4 = new Thread(new SumNumberTask(100),"Hundred Count");
		
		t3.start();
		t4.start();
		
	}
}
