package login_System;

public class SearchBookCntrlr {
Book b ;
	public SearchBookCntrlr(Bookself bs , String bookname ) {
	b =bs.searchBookByName(bookname) ;
	}


}
