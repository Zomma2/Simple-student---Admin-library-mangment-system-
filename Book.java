package login_System;

public class Book {
	
	String name ; 
	int numberOfPages ; 
	String author ; 
	boolean rentState = false  ; 
	String BookCategory ;
	String language ; 
	
	public Book(String name , int numberOfPages , String author , String BookCategory , String language) {
		this.name = name ; 
		this.author = author ; 
		this.BookCategory = BookCategory ; 
		this.numberOfPages = numberOfPages ; 
		this.language = language ; 
		
	}
	
	
	
	
}

