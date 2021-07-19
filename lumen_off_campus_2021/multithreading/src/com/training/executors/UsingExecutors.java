package com.training.executors;

import java.util.concurrent.*;

import com.training.tasks.PrintStringForExeuctor;
import com.training.tasks.UsingPrintString;
public class UsingExecutors {

	public static void main(String[] args) {

		
	//	ExecutorService service = Executors.newSingleThreadExecutor();
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		System.out.println(service.getClass().getName());
		
				
		
		Runnable[] targets = {
				new PrintStringForExeuctor("india", "delhi"), 
				new PrintStringForExeuctor("srilanka", "colombo"),
				new PrintStringForExeuctor("Nepal", "kathmadnu"),
				new PrintStringForExeuctor("Bangaladesh", "dhaka")
				};
		
		
		for(Runnable eachTarget : targets) {
		
			service.execute(eachTarget);
		}
		
		service.shutdown();
		
	}

}
