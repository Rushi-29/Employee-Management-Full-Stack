package com.gdtc.Employee.management.system.Service;

import com.gdtc.Employee.management.system.model.Expense;
import com.gdtc.Employee.management.system.model.Leave;
import com.gdtc.Employee.management.system.repository.ExpensesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ExpensesService {
    @Autowired
    ExpensesRepo expensesRepo;
    public List<Expense> getAllExpenses() {
        return expensesRepo.findAll();
    }

    public String createExpenses(Expense expense) {
        expensesRepo.save(expense);
        return "expense request raised successfully";
    }

    public String updateStatus(Expense expense) {
        expensesRepo.save(expense);
        return "status updated successfully";
    }
}
