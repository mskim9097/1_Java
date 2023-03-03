package edu.kh.book.run;

import edu.kh.book.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		
		BookService bs = new BookService();
		
		bs.displayMenu();

	}

}
