package com.training;

public class Application {

	public static void main(String[] args) {
		//runnable is a functional interface and exp is a lambda expression.
		Runnable exp = () -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hi Lambda");
			}
		};
	
	Thread t = new Thread(exp);
	
	t.start();
	}

}
