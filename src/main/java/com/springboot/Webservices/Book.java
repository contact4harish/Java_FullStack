package com.springboot.Webservices;

public class Book {
private String author;
private long id;
private String book;

	public Book(long id, String author, String book) {
		this.setId(id);
		this.setAuthor(author);
		this.setBook(book);
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", id=" + id + ", book=" + book + "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

}
