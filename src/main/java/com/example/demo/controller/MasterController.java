package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class MasterController {
	
	
	
	@Autowired
	ExpenseService expenseService;
	
	static Long edit_id; //Storing id for the expense which we want to edit
    	
	
	@RequestMapping("/")
    public ModelAndView home() {
		
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("message","List of expenses");
		List<Expense> expenses = expenseService.findAll();
		mav.addObject("expenses",expenses);
		return mav; 
	}
	
	
	@RequestMapping("/expense")
 public ModelAndView addexpense() {
		
		
		ModelAndView mav=new ModelAndView("expense");
		mav.addObject("expenses",new Expense());
		return mav; 
	}
	
	

	@RequestMapping(value="/expense",method=RequestMethod.POST)
 public String save(@ModelAttribute("expenses") Expense expense){
		
		Long temp_id= edit_id;
		System.out.println(temp_id);
		
		
		if(temp_id!=null && expenseService.findById(temp_id)!=null) {
			expenseService.update(expense,edit_id);
		}
		else
		expenseService.save(expense);
		
		return "redirect:/";
		 
	}
	
	

    @RequestMapping(value="/expense/{id}")
	 public ModelAndView edit(@PathVariable("id") Long id){
    	
    	    edit_id=id;
			ModelAndView mav= new ModelAndView("edit");
			Expense expense=expenseService.findById(id);
			mav.addObject("expense",expense);
			return mav;
			 }
	
	
    
    
    @RequestMapping(value="/expense/{id}/delete")
	 public String delete(@PathVariable("id") Long id){
    	expenseService.delete(id);
    	
    	
    	return "redirect:/";
    
    }
	
	
	
	
	
	
	
	
	
}
