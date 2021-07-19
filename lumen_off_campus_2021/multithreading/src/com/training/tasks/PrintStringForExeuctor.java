package com.training.tasks;

public class PrintStringForExeuctor implements Runnable {

	private String str1;
	private String str2;
	
	
	public PrintStringForExeuctor(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
	
	}


	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		PrintString.print(str1, str2);
	}


}
