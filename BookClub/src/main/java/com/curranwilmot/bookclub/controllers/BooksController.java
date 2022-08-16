package com.curranwilmot.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curranwilmot.bookclub.models.Book;
import com.curranwilmot.bookclub.services.BookService;
import com.curranwilmot.bookclub.services.UserService;

@Controller
public class BooksController {
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	
	@GetMapping("/books/new")
	public String newBook(
			@ModelAttribute("book") Book book,
			HttpSession session,
			Model model
			) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "newBook.jsp";
	}
	@PostMapping("/books/new")
	public String createBook(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
			return "newBook.jsp";
		}
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String viewBook(@PathVariable("id") Long id, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Book book = bookService.findBook(id);
		if(book.getUser().getId().equals(session.getAttribute("userId"))) {
			model.addAttribute("readerName", "You");
			model.addAttribute("readerName2", "your");
		}
		else {
			model.addAttribute("readerName", book.getUser().getUserName());
			model.addAttribute("readerName2", book.getUser().getUserName() + "'s");
		}
		model.addAttribute("book", book);
		return "viewBook.jsp";
	}
	@GetMapping("/books/edit/{id}")
	public String editBook(
			@ModelAttribute("book") Book book,
			@PathVariable("id") Long id,
			HttpSession session,
			Model model
			) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "editBook.jsp";
	}
	
	
	@PutMapping("/books/edit/{id}")
	public String updateBook(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
			return "editBook.jsp";
		}
		bookService.updateBook(book);
		return "redirect:/books";
	}
}
