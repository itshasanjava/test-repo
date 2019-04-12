package org.cetpa.beans;

public class Book {
	private int isbn;
	private String topic;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Book() {
	}

	public Book(int isbn, String topic) {
		super();
		this.isbn = isbn;
		this.topic = topic;
	}
}