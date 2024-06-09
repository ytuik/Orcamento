package com.app.orcamento.repositories.Expense.impl;

import com.app.orcamento.dao.Expense.ExpenseDAO;
import com.app.orcamento.models.Expense.Expense;
import com.app.orcamento.repositories.Expense.ExpenseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class ExpenseRepositoryImpl implements ExpenseRepository {

    @Autowired
    private ExpenseDAO expenseDAO;

    @Override
    public void addExpense(Expense expense) {
        this.expenseDAO.save(expense);
    }

    @Override
    public void removeExpense(Long id) {
        this.expenseDAO.deleteById(id);
    }

    @Override
    public void updateExpense(Expense expense) {
        this.expenseDAO.save(expense);
    }

    @Override
    public Expense getExpenseById(Long id) {
        Optional<Expense> expenseOptional = this.expenseDAO.findById(id);
        Expense expense = null;
        if(expenseOptional.isPresent()) {
            expense = expenseOptional.get();
        }else{
            throw new RuntimeException("There's no Expense with the id: " + id);
        }
        return expense;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return this.expenseDAO.findAll();
    }

    @Override
    public List<Expense> getExpensesByDate(String date) {
            return this.expenseDAO.findByDate(dateFormatter(date));
    }

    private Date dateFormatter (String date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date: " + date, e);
        }
    }

}

