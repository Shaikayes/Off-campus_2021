package com.training.interthread;

public class Application {

	public static void main(String[] args) {

		Runnable task = () -> { 
			for(int i=0;i<10;i++)
			{
			System.out.println("Hello World");
			}
		};
		
		Thread t = new Thread(task);
		
		t.start();
		
		BankAccount account = new BankAccount();
		
		Thread t1=new Thread(){
			public void run(){
				System.out.println("Current Balance :="+account.withdraw(4000));
			   }  
			};
			t1.start();

			Thread t2=new Thread(){
				public void run(){
					System.out.println("Current Balance:="+account.deposit(8000));
				   }  
				};
				t2.start();
			
	}

}
