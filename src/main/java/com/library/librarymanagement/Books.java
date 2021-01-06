package com.library.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Books {

	@Value("100")
	private int ISBN;
	@Value("fygfy")
	private String title;
	@Value("99")
	private int noOfCopies;
	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}


	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
