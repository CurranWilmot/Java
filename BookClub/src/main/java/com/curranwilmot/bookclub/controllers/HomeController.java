package com.curranwilmot.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curranwilmot.bookclub.models.Book;
import com.curranwilmot.bookclub.models.LoginUser;
import com.curranwilmot.bookclub.models.User;
import com.curranwilmot.bookclub.services.BookService;
import com.curranwilmot.bookclub.services.UserService;

@Controller
public class HomeController {

	// Add once service is implemented:
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String index(Model model) {
		
		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, 
			BindingResult result, 
			Model model,
			HttpSession session) {
		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!

		// Be sure to send in the empty LoginUser before
		// re-rendering the page.
		userService.register(newUser, result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		
		session.setAttribute("userId", newUser.getId());
		return "redirect:/books";
		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.

		
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
			BindingResult result, 
			Model model,
			HttpSession session) {

		// Add once service is implemented:
		// User user = userServ.login(newLogin, result);
		User user = userService.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		
		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
//		session.setAttribute("userId", model.getAttribute("newUser").getId());
		session.setAttribute("userId", user.getId());
		return "redirect:/books";
	}

	@GetMapping("/books")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		User user = userService.findUser((Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "home.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session){
//		session.setAttribute("userId", null);
		session.invalidate();
		return "redirect:/";
	}

}
