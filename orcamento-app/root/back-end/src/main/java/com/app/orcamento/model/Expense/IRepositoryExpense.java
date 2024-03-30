package com.app.orcamento.model.Expense;

import java.util.List;

public interface IRepositoryExpense {

    void addExpense(Expense expense);
    void deleteExpense(Long id);
    void editExpense(Expense expense);
    Expense getExpenseById(Long id);
    List<Expense> getExpenseByCategory(String categoryId);

}
