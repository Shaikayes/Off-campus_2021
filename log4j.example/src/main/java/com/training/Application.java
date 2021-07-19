package com.training;

	import org.apache.log4j.Logger;
	import java.util.*;

	public class Application {

		public static void main(String[] args) {
			Logger log = Logger.getRootLogger();
			log.info("log4j configured correctly");

			Scanner scn =new Scanner(System.in);
			System.out.println("enter a number:");
			int number=scn.nextInt();
		
			if(number<100) {
				
				log.error("invalid number");
			scn.close();
				throw new RuntimeException("exception");
		}
		else {
			log.debug("You entered a correct number");
	}
			
			scn.close();

		}

}
