package com.curranwilmot.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer incrementedCount = (Integer) session.getAttribute("count");
		session.setAttribute("count", ++incrementedCount);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "showCount.jsp";
	}
	
	@RequestMapping("/reset")
	public String resetCount(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/";
	}
	
}
