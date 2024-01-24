package com.gdtc.Employee.management.system.repository;

import com.gdtc.Employee.management.system.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepo extends JpaRepository<Expense,Integer> {
}
