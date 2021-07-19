package com.training.tasks;

public class UsingPrintString implements Runnable{

	private String str1;
	private String str2;
	
	
	public UsingPrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread t1 = new Thread(this);
		t1.start();
	}


	@Override
	public void run() {
		
		PrintString.print(str1, str2);
	}

	
	
}
