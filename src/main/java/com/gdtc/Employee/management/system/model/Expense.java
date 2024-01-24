package com.gdtc.Employee.management.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Double cost;
    private String comment;
    private LocalDate date;
    private Integer approverId;
    private String status;
    private ExpenseType expense;

    @ManyToOne
    private Employee employeeId;

}

