package com.rana.library_management_project;

import java.util.ArrayList;


public class Library 

{
	//Private field
	private ArrayList<Book> books;
	
	//no-argument constructor 
	public Library()
	{
		 books = new ArrayList<>();
	}
	
	/*
	 1) Method Name     : addBook()
     Parameter          : Book book
     Return Type        : void
     Access modifier    : public

     In this addBook() method, add Book object, If it has different 
     ISBN number, If ISBN number is same, It should print an error message Book with the same ISBN ..... already exists.")

     Use private method to perform validation.

     [ISBN stands for International Standard Book Number. It is a unique identifier for books just like roll for Student]
	 */
	public void addBook(Book book)
	{
		if(searchBookByISBN(book.getIsbn()) != null)
		{
			System.out.println("Book with the same ISBN already exists.");
		}
		else
		{
			books.add(book);
			System.out.println("Book added successfully.");
		}
	}
	
	
	/*
	 		2) Method Name     : searchBookByISBN()
            Parameter          : long isbn
            Return Type        : Book
            Access modifier    : private

            In this private Helper Method check whether the given ISBN number and Book isbn number both are same OR not, based on the condition return Book object or null.
	 */
	
	private Book searchBookByISBN(long isbn)
    {
        for(Book b : books)
        {
            if(b.getIsbn() == isbn)
            {
                return b;
            }
        }
        return null;
    }
	
	/*
	 		3) Method Name     : displayAllBooks()
            Parameter          : No Parameter
            Return Type        : void
            Access modifier    : public
            In this method, Display all the Books available in the Library.
	 */
	
	public void displayAllBooks()
	{
		if(books.isEmpty())
		{
			IO.println("NO books are available in the library.");
		}
		System.out.println("Book are available in the library.");
		for (Book book : books) 
		{
			IO.println(book);
		}
	}
	
	/*
	5) Method Name     : updateBookQuantityByISBN()
    Parameter          : long isbn
    Return Type        : void
    Access modifier    : public
    In this method update the quantity the Book, In order to update the quantity, first verify ISBN number by using private Helper method and then update the quantity by using setter method.
    If the updated quantity is 0 OR -ve . It should provide error message.

	 */
	
	public void updateBookQuantityByISBN(long isbn,int newQuantity)
	{
		Book book=getBookByISBN(isbn);
		
		if(book==null)
		{
			System.out.println("Book with ISBN " + isbn + " not found.");
	        return;
		}
		if(newQuantity <= 0)
	    {
	        System.out.println("Error: Quantity cannot be 0 or negative.");
	    }
	    else
	    {
	        book.setQuantity(newQuantity);
	        System.out.println("Book quantity updated successfully.");
	    }
	}
	
	// Private helper method
	private Book getBookByISBN(long isbn)
	{
	    for(Book b : books)
	    {
	        if(b.getIsbn() == isbn)
	        {
	            return b;
	        }
	    }
	    return null;
	}
	
	
	/*
	 
		6) Method Name     : deleteBookByTitle()
		Parameter          : String title
		Return Type        : void
		Access modifier    : public

		In this method delete the Book object using title, If parameter 
		variable is null OR blank, It should print error message "Book Title cannot be blank".
	 */
	
	public void deleteBookByTitle(String title)
	{
		if(title==null || title.trim().isEmpty())
		{
			IO.println("Book title cannot be null.");
			return;
		}
		boolean removed =false;
		
		
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getTitle().equalsIgnoreCase(title))
			{
				books.remove(i);
				removed =true;
				System.out.println("Book Deleted successfully.");
				break;
			}
		}
		
		if(!removed)
	    {
	        System.out.println("Book with title \"" + title + "\" not found.");
	    }
	
	}
	
}


