package com.example.demo.service;
import java.util.*;
import com.example.demo.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
	
	
	
	void save(Expense expense);
	
	void update(Expense expense,Long id);
	
	void delete(Long id);
	
	Expense findById(Long id);
	
	
	
}
