package login_System;

import java.util.ArrayList;

public class RentBookCntrlr {
	Book b ; 
	public RentBookCntrlr(Bookself bs  , String name , ArrayList<Book> stdRentedBooks  ) {
		for(int i =0 ; i<bs.bookArrayList.size() ; i++)
		{
			if (bs.bookArrayList.get(i).name.contains(name))
			{
			 b = bs.bookArrayList.get(i) ; 
				stdRentedBooks.add(b) ; 
			bs.bookArrayList.remove(b) ; 
			}
			
		}
		
		
		
		

	
	}




}
