package com.curranwilmot.dojosandninjas.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.curranwilmot.dojosandninjas.models.Dojo;
import com.curranwilmot.dojosandninjas.models.Ninja;
import com.curranwilmot.dojosandninjas.services.DojoService;
import com.curranwilmot.dojosandninjas.services.NinjaService;

@Controller
public class DojosController {
	
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	@GetMapping("/")
	public String index() {
		return "dojos/index.jsp";
	}
	
	@GetMapping("/dojos")
	public String displayDojos(Model model) {
		ArrayList<Dojo> dojos = (ArrayList<Dojo>) dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "dojos/dojos.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/newDojo.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String displayNinjas(Model model, @PathVariable("id") Long id ) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "/ninjas/ninjasInDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(
			@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "/dojos/newDojo.jsp";
		}
		else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		ArrayList<Dojo> dojos = (ArrayList<Dojo>) dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "/ninjas/newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model
			) {
		if(result.hasErrors()) {
			ArrayList<Dojo> dojos = (ArrayList<Dojo>) dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "ninjas/newNinja.jsp";
		}
		else {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos";
		}
	}
}
