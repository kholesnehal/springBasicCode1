package com.springcore.autowired;

public class Book {
	private String ISBN;
	private String bookName;
	private Author author;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String iSBN, String bookName, Author author) {

		super();
		ISBN = iSBN;
		this.bookName = bookName;
		this.author = author;

	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", bookName=" + bookName + ", author=" + author + "]";
	}
	

}
