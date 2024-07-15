package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ExpenseRepository;
import com.example.demo.vo.Expense;

//@Controller
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {


    @Autowired
    private ExpenseRepository expenseRepository;
    

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    
    
    
    @DeleteMapping
    public String deleteExpense(@RequestBody int id) {
    	expenseRepository.deleteById(id);
    	return "Success";
    }
    
    
    
    
}
