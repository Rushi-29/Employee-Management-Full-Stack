package com.gdtc.Employee.management.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String lastName;
    private LocalDate joiningDate;
    private Boolean probation;
    private Integer managerId;
    private Double salary;
    private LocalDate birthDate;
    private String password;

    @ManyToOne
    private Designation designationId;



}
