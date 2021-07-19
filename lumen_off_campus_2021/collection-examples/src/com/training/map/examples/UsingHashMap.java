package com.training.map.examples;
import java.util.*;

import com.training.model.Book;
public class UsingHashMap {

	public static void main(String[] args) {

		
		// Integer is the wrapper class of int 
		// Since Collection allows only Objects we are using wrapper class
		// User Defined class can also be used a Key provided it overrides equals and hashCode
		
		HashMap<Integer, Book> bookList = new HashMap<>();
		
		Book headFirst = new Book(101,"Head first java", 45.00);
		Book spring = new Book(102,"Professional Spring", 145.00);
		Book html = new Book(201,"HTML for dummies", 345.00);
		
		// Auto Boxing Feature of Java converts the int 1 to Integer 1 -Primitive ->Wrapper Class
		bookList.put(1, headFirst);
		bookList.put(2, spring);
		
		Object resp1 =bookList.put(3, html);
		
		//Object resp2 =bookList.put(3, html);
		
		
		//System.out.println(bookList.get(2));
		
		
		System.out.println("Response -1"+ resp1);
		
		//System.out.println("Response -2"+ resp2);
		
		    
		    Set<Map.Entry<Integer, Book>>  setViewOfMap = bookList.entrySet();
		    
		      Iterator<Map.Entry<Integer, Book>> itr=  setViewOfMap.iterator();
		     
		      while(itr.hasNext()) {
		    	  
		    	  Map.Entry<Integer,Book> found = itr.next();
		    	  
		    	  System.out.println(found.getKey());
		    	  System.out.println(found.getValue());
		    	  
		      }
		      
		     
		      Set<Integer> keys =bookList.keySet();
		      
		      for(Integer eachKey : keys) {
		    	  
		    	  System.out.println(bookList.get(eachKey));
		      }
		
		      
	}

}
