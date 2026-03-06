package com.rana.library_management_project;

public class Book 
{
	private String title;
	private String aurthor;
	private long isbn;
	private double price;
	private int quantity;
	
	//parameterized constructor to initialize non static field
	public Book(String title, String aurthor, long isbn, double price, int quantity) {
		super();
		this.title = title;
		this.aurthor = aurthor;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}

	//create getter method for all non static field
	public String getTitle() {
		return title;
	}

	public String getAurthor() {
		return aurthor;
	}

	public long getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	

	@Override
	public String toString() {
		return " Book[title=" + title + ", aurthor=" + aurthor + ", isbn=" + isbn + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
	//setter method of all non static method
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAurthor(String aurthor) {
		this.aurthor = aurthor;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
}
