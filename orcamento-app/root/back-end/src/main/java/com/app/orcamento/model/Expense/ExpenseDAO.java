package com.app.orcamento.model.Expense;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseDAO extends JpaRepository<Expense, Long> {

    List<Expense> findByCategoryId(String categoryId);
    
}