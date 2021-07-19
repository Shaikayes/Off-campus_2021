package com.training.tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class UsingCallable {

	public static void main(String[] args) {

		
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		SumNumberWithCall task = new SumNumberWithCall(10);
		
		 Future<Integer> future= service.submit(task);
		 
		 
//		   try {
//			System.out.println(" Count Result :"+future.get());
//			System.out.println(" Is Task Completed:="+ future.isDone());
//			
//		} catch (InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		}
		   
		   while(!future.isDone()) {
			   System.out.println("Wait....");
			   try {
				TimeUnit.MILLISECONDS.sleep(300);
				System.out.println("Count Result:="+future.get());

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		   }
		service.shutdown();
	}

}
