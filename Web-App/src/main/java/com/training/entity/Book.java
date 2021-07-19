package com.training.entity;

public class Book {
	public int getBookId() {
		return bookId;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
		@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private int bookId;
	private String bookName;

}
