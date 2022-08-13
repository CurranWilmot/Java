package com.curranwilmot.mvc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.curranwilmot.mvc.models.Book;
import com.curranwilmot.mvc.services.BookService;


@Controller
public class BookController {
	
	@Autowired
	BookService bookservice;
	@GetMapping("/books")
	public String index(Model model) {
		ArrayList<Book> books = (ArrayList<Book>) bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	@Autowired
	BookService bookService;
	@GetMapping("/books/{bookId}")
	public String oneBook(Model model, @PathVariable("bookId") Long bookId) {
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		return "oneBook.jsp";
	}
}
