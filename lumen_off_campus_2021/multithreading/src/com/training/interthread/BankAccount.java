package com.training.interthread;


public class BankAccount {

	private double balance=1000;
	
	public synchronized double deposit(double amount) {
		
		balance=balance+amount;

		notifyAll();

		return balance;

			}
	
	public synchronized double withdraw(double amount) {
		
		if(balance <amount) {
			System.out.println("In sufficent Balance ");
			   try {
			   
			     wait();
			} catch (InterruptedException e) {
			               e.printStackTrace();
			          }
			}

			 balance =balance-amount;
			 
			return balance;
	}
}
