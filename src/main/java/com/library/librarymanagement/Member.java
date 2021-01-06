package com.library.librarymanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
@Component
public class Member extends Person{

	@Autowired
	BookItem item;
	private int totalBooksCheckedout;
	private AccountStatus astatus=AccountStatus.ACTIVE;
	

	public int getTotalBooksCheckedout() {
		return totalBooksCheckedout;
	}
	public void setTotalBooksCheckedout(int totalBooksCheckedout) {
		this.totalBooksCheckedout = totalBooksCheckedout;
	}
	public AccountStatus getAstatus() {
		return astatus;
	}
	public void setAstatus(AccountStatus astatus) {
		this.astatus = astatus;
	}
	
	

	
	@Override
	public String toString() {
		return "Member [totalBooksCheckedout=" + totalBooksCheckedout + ", astatus=" + astatus + ", name=" + name + "]";
	}
	public BookItem checkoutBook(Books book)
	{

		if(book.getNoOfCopies()==0)
		{
			System.out.println("Book copy not available to lend");
			return null;
		}
			else if(this.getAstatus()!=AccountStatus.ACTIVE)
		{
			System.out.println("Not an active member not eligible to borrow");
			return null;
		}
		else
		{

			BookStatus st= BookStatus.LOANED;
			item.checkout();
			return item;		
		}
		
	}
	
	public void checkinBook(BookItem item)
	{
		item.checkin();
	}
}
