package com.example.demo.model;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.Expense;


public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
