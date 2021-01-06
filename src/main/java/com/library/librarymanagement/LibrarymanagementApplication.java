package com.library.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LibrarymanagementApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(LibrarymanagementApplication.class, args);
		Member mem1=context.getBean(Member.class);
		Books book1=context.getBean(Books.class);
		mem1.checkoutBook(book1);
	}


}
