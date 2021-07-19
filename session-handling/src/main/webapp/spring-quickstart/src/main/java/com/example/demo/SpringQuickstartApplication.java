package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerService;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoicewithSetterDI;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringQuickstartApplication.class, args);
//		Product product1=ctx.getBean("tv",Product.class);
//		System.out.println(product1);
//		
//		Product product2=ctx.getBean("fridge",Product.class);
//		System.out.println(product2);
		
//		Invoice inv= ctx.getBean(Invoice.class);
//
//	    System.out.println(inv);
		
//		InvoicewithSetterDI inv = ctx.getBean(InvoicewithSetterDI.class);
//		System.out.println(inv);
		
		CustomerService service = ctx.getBean(CustomerService.class);
		service.getCustList().forEach(System.out::println);
	    ctx.close();
	    
	    //create a Instance of CustomerService new CustomerService.
	    //create three customer customer cust1=new Customer();
	   // create a Array List of type List<Customer>=new ArrayList<>();
	    //add elements to array List list.add(cust);

	}

	@Bean
	public Product tv() {
		return new Product(101,"tv", 34000);
	}
	
	@Bean
	@Primary
	public Product fridge() {

	return new Product(102,"fridge", 50000);
	}
	
	@Bean
	public Customer ram() {

	return new Customer(203,"Rani", 944395);
	}
	
	@Bean
	public Customer raheem() {

	return new Customer(204,"Mani", 9443990);
	}

	@Bean
	public Customer robert() {

	return new Customer(205,"Honey", 9443989);
	}


}
