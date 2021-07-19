package com.training.tasks;

public class PrintNumbers implements Runnable {

	private int count;
	private String message;
	
	
	public PrintNumbers(int count,String message) {
		super();
		this.count = count;
		this.message = message;
	}


	@Override
	public void run()  {

		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<this.count;i++) {
			System.out.println(message);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
