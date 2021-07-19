package com.training.tasks;

import java.util.concurrent.Callable;

public class SumNumberWithCall  implements Callable<Integer>{

	private int countTo;
	
	
	public SumNumberWithCall(int countTo) {
		super();
		this.countTo = countTo;
	}


	@Override
	public Integer call() throws Exception {

		int sum =0;
		for(int i=0;i<=countTo;i++) {
			
			sum=sum+i;
		}
		
	    return sum;
	}



	
	

}
