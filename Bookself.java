package login_System;

import java.util.ArrayList;

public class Bookself {
	  ArrayList<Book> bookArrayList = new ArrayList<>();

public Bookself() {
Book harryPotterAndTPS = new Book("Harry Potter and the Philosopher's Stone ", 309, "J. K. Rowling", "Novel", "English") ;  
Book discoverNature  = new Book("Discover Nature ", 1000, "Michel S.Maven", "Science", "English") ;  
Book learnFrensh = new Book("Easy learn Frensh !!", 1200, "Michel Adam", "Learning", "Arabic") ;  
Book holyQuran = new Book("holy Quran", 604, "God", "Religion", "Arabic") ;  
Book wordldMap = new Book("the Complete Word Map ", 150,"Mohamed Mahdy ", "Geographic ", "Arabic") ;  

	
bookArrayList.add(harryPotterAndTPS);
bookArrayList.add(discoverNature);
bookArrayList.add(learnFrensh);
bookArrayList.add(holyQuran);
bookArrayList.add(wordldMap);


}
	 
	 public  void  addBook(Book book )
{
	bookArrayList.add(book) ;

}
public Book searchbook(Book b ) {
	for (int i = 0 ; i<bookArrayList.size() ; i++)
	{
		if (bookArrayList.get(i).equals(b)) 
		{
			return bookArrayList.get(i) ;
		}
		
	}
	
	return null ;
}
	 public Book searchBookByName(String name)
	 {
		for(int i = 0 ; i < bookArrayList.size() ; i++)
		{
			if (bookArrayList.get(i).name.contains(name) )
			{
				return bookArrayList.get(i) ; 
			}
		}
	return null ;	 
	 }

public boolean deleteBook (String name)
{
	
		for(int i =0 ; i<bookArrayList.size() ; i++)
		{
			if (bookArrayList.get(i).name.contains(name))
			{
				bookArrayList.remove(i) ;
				return true ; 
			}
		}
		
	

		return false ; 
	
}


public boolean  updateBook(String name , int numberOfPage , String Author , String category , String Language ) {
	if(searchBookByName( name )!=null)
	{
		for(int i =0 ; i<bookArrayList.size() ; i++)
		{
			if (bookArrayList.get(i).name.contains(name))
			{
				bookArrayList.get(i).numberOfPages=numberOfPage ; 
				bookArrayList.get(i).author = Author;
				bookArrayList.get(i).BookCategory = category ;
				bookArrayList.get(i).language = Language ; 
			return true ;
			}
	
		
}
 

}
	return false ;
}
}



