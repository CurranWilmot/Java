package com.curranwilmot.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/omikuji")
@Controller
public class OkikujiFormController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/make")
	public String login(
		@RequestParam(value="numberYear") String numberYear,
		@RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="livingThing") String livingThing,
	    @RequestParam(value="niceThing") String niceThing,
		HttpSession session
	) {
		session.setAttribute("numberYear", numberYear);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("niceThing", niceThing);
	    
	    // CODE TO PROCESS FORM ie. check email and password
	    	
	   	return "redirect:/omikuji/show"; // <-- we'll change this when we learn redirecting
	}
	
	@RequestMapping("/show")
	public String home() {
		return "results.jsp";
	}

}
