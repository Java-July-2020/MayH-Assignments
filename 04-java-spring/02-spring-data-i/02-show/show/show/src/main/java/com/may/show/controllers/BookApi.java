package com.may.show.controllers;

import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.may.show.models.Book;
import com.may.show.services.BookService;

@RestController 
public class BookApi {
    private final BookService bookService;
    
    public BookApi(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/api/books")
    public String index() {
        return bookService
        		.allBooks()
        		.stream()
        		.map(Book::toString)
        		.collect(Collectors.joining(",\n"));
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    // not the best practice to use RequestParam for fields that can be really long such as the description
    public Book create(
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang, 
    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
}
