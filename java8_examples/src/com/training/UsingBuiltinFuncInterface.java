package com.training;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class UsingBuiltinFuncInterface {
	
	public void usingPredicate() {

	Predicate<Double> checkHousingLoanEligibility = 
			(SalaryPerMonth) -> {
				
				boolean result=false;
				if(SalaryPerMonth>30000) {
					result=true;
			}
			
			return result;
};
	
		System.out.println("Ramesh with 20000 salary is eligible:" + checkHousingLoanEligibility.test(20000.00));
		System.out.println("Suresh with 40000 salary is eligible:" + checkHousingLoanEligibility.test(40000.00));
	}
	
	public void usingConsumer() {
		
		List<String> names = new ArrayList<>();
			names.add("Ayesha");
			names.add("Babulu");
			names.add("ammu");
			names.add("roshni");
			//Consumer takes argument but doesn't return anything.
			Consumer<String> print = (name) -> System.out.println(name);
			names.forEach(print);
			//names.forEach(System.out::println);
			
	}
	
	public void usingFunction() {
		Function<Double,Double> currencyConvertor =(inr) -> inr/70;
		System.out.println("INR to USD" + currencyConvertor.apply(100.00));
	}

	
	public static void main(String[] args) {
		
		UsingBuiltinFuncInterface obj = new UsingBuiltinFuncInterface();
		
		obj.usingPredicate();
		obj.usingConsumer();
		obj.usingFunction();
	}
}
		
