package com.sopra.model;

import javax.persistence.Entity;

@Entity
public class Book {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private int bookAvailability;

	public int getBookId() {
		return bookId;
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

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookAvailability() {
		return bookAvailability;
	}

	public void setBookAvailability(int bookAvailability) {
		this.bookAvailability = bookAvailability;
	}

}
