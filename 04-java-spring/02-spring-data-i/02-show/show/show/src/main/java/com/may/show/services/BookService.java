package com.may.show.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.may.show.models.Book;
import com.may.show.repositories.BookRepository;

@Service
public class BookService {
	
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
        return bookRepository.findAll();
    }

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		return optionalBook.orElseThrow(() -> new IllegalStateException("Book with id" + id + " was not found."));
	}

	public Book findBookByIndex(int index) {
		List<Book> books = allBooks();
		if (index > books.size() || index < 0) {
			throw new IllegalArgumentException("Invalid book index");
		}
		return books.get(index);
	}
	
    public Book updateBook(Long id, Book updatedBook) {
		return this.bookRepository.save(updatedBook);
    }
    
    public void deleteBook(Long id) {
		this.bookRepository.deleteById(id);
	}
}
