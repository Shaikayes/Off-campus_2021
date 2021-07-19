package com.training.model;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import java.util.*;
public class Application {

	
	public static void print(List<?> list) {
		
		
		list.forEach(System.out::println);
	}
	public static void main(String[] args) {

		
		Book headFirst = new Book(101,"Head first java", 45.00);
		Book spring = new Book(102,"Professional Spring", 145.00);
		Book html = new Book(201,"HTML for dummies", 345.00);
		
	    List<Book> bookList = Arrays.asList(headFirst,spring,html);
	    
	    
	    //source.stream().intermediateOperation(lambda).terminalOperation
	    
	    bookList.stream().filter(e -> e.getRatePerUnit()>300).forEach(System.out::println);
	    
	  //source.stream().intermediateOperation(lambda).terminalOperation that collects elements
	    // to a list
	    
	  List<Book> filterByPrice=  
			            bookList.stream().filter(e -> e.getRatePerUnit()<300).collect(toList());
	    
	  System.out.println("USing FILTER METHOD");
	   print(filterByPrice);
	   
	   System.out.println("Using MAP Operator");
	   List<String> bookNameList=  
	            bookList.stream().map(e -> e.getBookName()).collect(toList());

	  print(bookNameList);
	  
	  System.out.println("Using MORE THAN ONE Intermediate OPERATOR");
	  
	  // select bookName from book where ratePerUnit<300
	  List<String> justNamesFilterByPrice=  
	            bookList.stream().filter(e -> e.getRatePerUnit()<300).map(e-> e.getBookName()).collect(toList());

	  print(justNamesFilterByPrice);
	  
	  Map<String,Double> bookAndPrice= 
			  
			         bookList.stream().filter(e -> e.getRatePerUnit()<300)
			             .collect(toMap(Book::getBookName, Book::getRatePerUnit));
	  
	  
	       List<Book> sortedByPrice =
	    		    bookList.stream().sorted(Comparator.comparing(Book::getRatePerUnit)).collect(toList());
	       
	       System.out.println("SORTED BY Price");
	       
	       print(sortedByPrice);
	       
	       // Find the costiliest book and also the least priced book
	       
	}

}
// max

