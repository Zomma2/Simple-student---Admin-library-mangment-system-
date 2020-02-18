package login_System;

public class UpdateBookcntrlr {
public UpdateBookcntrlr(Bookself bs , Book book) {
	bs.updateBook(book.name, book.numberOfPages, book.author, book.BookCategory, book.language) ;
}
}
