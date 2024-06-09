package com.app.orcamento.service;

import com.app.orcamento.models.Expense.Expense;
import com.app.orcamento.repositories.Expense.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(String name, BigDecimal price, String date){
        Expense expense = new Expense();
        expense.setName(name);
        expense.setPrice(price);
        expense.setDate(new Date(date));
        this.expenseRepository.addExpense(expense);
    }

    public void deleteExpense(Long id){
        this.expenseRepository.removeExpense(id);
    }

    public void updateExpense(Long id, String name, BigDecimal price, String date){
        if(this.expenseRepository.getExpenseById(id) == null){
            throw new RuntimeException("There's no Expense with the id: " + id);
        }
        Expense expense = this.expenseRepository.getExpenseById(id);

        expense.setName(name);
        expense.setPrice(price);
        expense.setDate(new Date(date));

        this.expenseRepository.updateExpense(expense);
    }

    public Expense getExpenseById(Long id){
        return this.expenseRepository.getExpenseById(id);
    }

    public List<Expense> getAllExpenses(){
        return this.expenseRepository.getAllExpenses();
    }

    public List<Expense> getExpensesByDate(String date) throws ParseException {
        return this.expenseRepository.getExpensesByDate(date);
    }
}
