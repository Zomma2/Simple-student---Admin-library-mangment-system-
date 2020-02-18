package login_System;

import java.util.Random;

public class RequestBookcntrlr {
	Random rand = new Random ();
	public RequestBookcntrlr(String requestedBookname , String requestAuthorName , String requestedCategory ,String requestedLanguage) {
	Admin.requestBookList.add(new Book(requestedBookname, rand.nextInt(1000), requestAuthorName, requestedCategory, requestedLanguage)) ; 
	}
}
