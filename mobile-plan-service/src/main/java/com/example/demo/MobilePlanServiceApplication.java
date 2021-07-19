package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.MobilePlan;

@SpringBootApplication
public class MobilePlanServiceApplication {
	//In spring beans are eagerly created.
	//In spring beans are created by default. We can also make them lazy by adding @lazy annotation.
	//beans are singleton by default.
	//beans are stateless.
	//if they are not singleton then they are prototype is done by using the annotation @scope("prototype")

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(MobilePlanServiceApplication.class, args);
		
		MobilePlan plan1 =ctx.getBean("mobilePlan", MobilePlan.class);
		System.out.println(plan1);
		MobilePlan plan2 =ctx.getBean("mobilePlan", MobilePlan.class);
		System.out.println(plan2);
		
		System.out.println("is Singleton:="+ctx.isSingleton("mobilePlan"));
		System.out.println("is Prototype:="+ctx.isPrototype("mobilePlan"));

	}
	
	@Bean
	public MobilePlan Prepaid() {
		
		return new MobilePlan(200, "Plan499", 400, 28);
	}
	
   @Bean
	public MobilePlan Postpaid() {
		
		return new MobilePlan(400, "Monthly", 900, 30);
	}


}
