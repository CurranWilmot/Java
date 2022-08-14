package com.curranwilmot.savetravels.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curranwilmot.savetravels.models.Expense;
import com.curranwilmot.savetravels.services.ExpenseService;




@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	@GetMapping("/expenses")
	public String index(
			Model model,
			@ModelAttribute("expense") Expense expense
			) {
		ArrayList<Expense> expenses = (ArrayList<Expense>) expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	@PostMapping("/expenses")
	public String createExpense(
			@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result,
			Model model)
	//include Model model to include the table - put Model model at end
	//otherwise you will get errors
	{
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenseService.allExpenses());
			return "index.jsp";
		}
		expenseService.createExpense(expense);
		return "redirect:/expenses";
	}
	@GetMapping("/expenses/{expenseId}")
	public String oneExpense(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "oneExpense.jsp";
	}
	@GetMapping("/expenses/{id}/edit")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "editExpense.jsp";
	}
	@PutMapping(value="/expenses/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "editExpense.jsp";
		}
		else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	@DeleteMapping("/expenses/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
}
