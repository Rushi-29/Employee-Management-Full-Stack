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
@Table(name="leave1")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private LocalDate toDate;
    private LocalDate fromDate;
    private String note;
    private Integer approverId;
    private Boolean approved;
    private String status;
    private LeaveType leaveTypeId;

    @ManyToOne
    private Employee employeeId;

}
