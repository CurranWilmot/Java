package com.curranwilmot.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.curranwilmot.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
	
}
