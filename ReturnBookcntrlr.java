package login_System;

import java.util.ArrayList;

public class ReturnBookcntrlr {
	Book b ; 
		public ReturnBookcntrlr (Bookself bs  , String name , ArrayList<Book> stdRentedBooks) {
		
			for(int i =0 ; i<stdRentedBooks.size() ; i++)
			{
				if (stdRentedBooks.get(i).name.contains(name))
				{
				 b = stdRentedBooks.get(i) ; 
				 bs.bookArrayList.add(b) ; 
				 stdRentedBooks.remove(b) ; 
				
				}
				
			}
			


			
			
		}
}
