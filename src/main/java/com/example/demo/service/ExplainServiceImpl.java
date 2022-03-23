package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;


import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ExplainServiceImpl implements ExpenseService {

	
	
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}
	
	@Override 
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);
	}
	
	@Override
    public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent()) {
			return expenseRepository.findById(id).get();
		}
		
		
		return null;     
	}
	
	
	@Override
    public void update(Expense expense,Long id) {
		expense.setId(id);
		expense.setAmount(expense.getAmount());
		expense.setExpensename(expense.getExpensename());
		expense.setNote(expense.getNote());
		expenseRepository.save(expense);
		System.out.println("id--> "+expense.getId()+" amount--> "+expense.getAmount()+" expensename--> "+expense.getExpensename()+" note--> "+expense.getNote());
	}
	
	
	
	@Override
    public void delete(Long id) {
		Expense expense = findById(id);
		expenseRepository.delete(expense);
	}
	
	
	
}
