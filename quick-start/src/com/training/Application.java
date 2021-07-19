package com.training;

public class Application {


	public static void main(String[] args) {

		Greeting grtObj = new Greeting();
		String username="ayesh";

		System.out.println(grtObj.getMessage());
		System.out.println(grtObj.getGreeting(username));

		System.out.println(grtObj.getGreeting(args[0]));

	}

}
