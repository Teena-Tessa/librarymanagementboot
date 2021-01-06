package com.library.librarymanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class BookItem  {
	@Autowired
	Books book;
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}

	private BookStatus status;


	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}

	public void checkout()
	{
		this.book.setNoOfCopies(this.book.getNoOfCopies()-1);
		this.status= BookStatus.LOANED;
		
		System.out.println("the book "+this.book.getTitle()+" lended"
				+ " number of copies remaining :"+this.book.getNoOfCopies());
	}
	
	public void checkin()
	{
		this.book.setNoOfCopies(this.book.getNoOfCopies()+1);
		this.status= BookStatus.AVAILABLE;

		System.out.println("the book "+this.book.getTitle()+" returned successfully"
				+ " number of copies remaining :"+this.book.getNoOfCopies());
		
	}
	
	

}
