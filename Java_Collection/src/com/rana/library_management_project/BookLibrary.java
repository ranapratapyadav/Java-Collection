package com.rana.library_management_project;

public class BookLibrary {

	public static void main(String[] args) 
	{
		Library lib=new Library();
		while (true) 
		{
			IO.println("1. Add Book");
			IO.println("2. Display Books");
			IO.println("3. Update Quantity");
			IO.println("4. Delete Book");
			IO.println("5. Exit");
			int option=Integer.parseInt(IO.readln("Choose The Option:"));
			
			switch(option)
			{
			case 1->
			{
				String title=IO.readln("Enter the title:");
				String aurthor=IO.readln("Enter the title of book:");
				long isbn=Long.parseLong(IO.readln("Enter the isbn:"));
				double price=Double.parseDouble(IO.readln("Enter the price of the book:"));
				int quantity=Integer.parseInt(IO.readln("Enter th equantity of the book:"));
				Book book=new Book(title, aurthor, isbn, price, quantity);
				lib.addBook(book);
			}
			
			case 2->lib.displayAllBooks();
			
			case 3->
			{
				long isbn=Long.parseLong(IO.readln("Enter the isbn:"));
				int quantity=Integer.parseInt(IO.readln("Enter th equantity of the book:"));

				lib.updateBookQuantityByISBN(isbn, quantity);
			}
			
			case 4->
			{
				String title=IO.readln("Enter the title:");
				lib.deleteBookByTitle(title);
			}
			
			case 5->IO.println("Exiting from the Application. Thank you!!!");
			}
		}

	}

}
