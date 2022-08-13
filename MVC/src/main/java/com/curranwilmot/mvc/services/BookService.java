package com.curranwilmot.mvc.services;
import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.curranwilmot.mvc.models.Book;
import com.curranwilmot.mvc.repositories.BookRepository;


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
	    if(optionalBook.isPresent()) {
	        return optionalBook.get();
	    } else {
	        return null;
	    }
	}
//	public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
//			Book b = new Book(title, desc, lang, numOfPages);
//			b.setId(id);
//		 Optional<Book> optionalBook = bookRepository.findById(b.getId());
//		    if(optionalBook.isPresent()) {
//		    	return bookRepository.save(b);
//		    } else {
//		        return null;
//		    }
//	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}

