package com.training.services;
import java.util.*;

import com.training.entity.Book;

public class BookServices {
	Map<String, List<Book>> bookList;

	
	public BookServices() {
		super();
		bookList= new HashMap<>	();
		init();
		}
	
	public void init() {
		
		List<Book> java = new ArrayList<>();
		java.add(new Book(101, "Head First Java"));
		java.add(new Book(102, "Spring in action"));
		
		List<Book> novel = new ArrayList<Book>();
		novel.add(new Book(201, "Harry Potter"));
		novel.add(new Book(201, "Three States"));
		
		bookList.put("java", java);
		bookList.put("novel", novel);
		
	}
	
	public List<Book> searchBook(String key){
		return this.bookList.get(key);
	}
	


}
