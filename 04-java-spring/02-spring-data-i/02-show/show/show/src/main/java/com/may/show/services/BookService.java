package com.may.show.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.may.show.models.Book;
import com.may.show.repositories.BookRepository;

@Service
public class BookService {
	// initialize the books variable with values
	private static final List<Book> EXTRA_BOOKS = Arrays.asList(
			new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
			new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby",
					"english", 180),
			new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
			new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
			new Book("The Odyssey", "Ancient Greek epic poem", "english", 475));
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
        return Stream
        		.concat(bookRepository.findAll().stream(), EXTRA_BOOKS.stream())
        		.collect(Collectors.toList());
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
}
