package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        BookService bookService = context.getBean("bookService", BookService.class);
        
        bookService.addBook("1984");

        String book = bookService.getBook("1984");
        System.out.println("Retrieved book: " + book);

    }
}
