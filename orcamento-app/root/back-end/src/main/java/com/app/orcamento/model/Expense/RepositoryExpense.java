package com.app.orcamento.model.Expense;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryExpense implements IRepositoryExpense {

    @Autowired
    private ExpenseDAO expenseDAO;

    @Override
    public void addExpense(Expense expense) {
       this.expenseDAO.save(expense);
    }

    @Override
    public void deleteExpense(Long id) {
        expenseDAO.deleteById(id);
    }

    @Override
    public void editExpense(Expense expense) {
       this.expenseDAO.save(expense);
    }

    @Override
    public Expense getExpenseById(Long id) {
        Optional<Expense> expenseOptional = expenseDAO.findById(id);
        Expense expense = null;
        if(expenseOptional.isPresent()){
            expense = expenseOptional.get();
        }else{
            throw new RuntimeException("There's no Expense with the id: " + id);
        }
        return expense;
    }

    @Override
    public List<Expense> getExpenseByCategory(String categoryId) {
       return expenseDAO.findByCategoryId(categoryId);
    }
    
}
