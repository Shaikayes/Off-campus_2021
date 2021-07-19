package com.training.services;

import java.util.Collection;

import com.training.ifaces.DataAccess;
import com.training.model.Book;

public class BookService implements DataAccess<Book> {

	@Override
	public boolean add(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Book... t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Book> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
