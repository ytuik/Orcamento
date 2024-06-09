package com.app.orcamento.repositories.Expense;

import com.app.orcamento.models.Expense.Expense;

import java.text.ParseException;
import java.util.List;

public interface ExpenseRepository {
    void addExpense(Expense expense);
    void removeExpense(Long id);
    void updateExpense(Expense expense);
    Expense getExpenseById(Long id);
    List<Expense> getAllExpenses();
    List<Expense> getExpensesByDate(String date) throws ParseException;
}
