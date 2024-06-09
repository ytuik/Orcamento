package com.app.orcamento.dao.Expense;

import com.app.orcamento.models.Expense.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseDAO extends JpaRepository<Expense, Long>{
    List<Expense> findByDate(Date newDate);
}
