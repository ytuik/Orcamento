package com.app.orcamento.model.Expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterExpense {
    
    @Autowired
    private IRepositoryExpense repositoryExpense;

    // public void addExpense(){
        
    // }

    public void deleteExpense(Long id){
        repositoryExpense.deleteExpense(id);
    }

    public Expense getExpenseById(Long id){
       return repositoryExpense.getExpenseById(id);
    }

    public List<Expense> getExpenseByCategory (String categoryId){
        return repositoryExpense.getExpenseByCategory(categoryId);
    }

    public void editExpense(Expense expense) throws Exception{
        if(getExpenseById(expense.getId()) == null){
            throw new NullPointerException("There's no expense with this ID");
        }
        repositoryExpense.editExpense(expense);
    }

}
