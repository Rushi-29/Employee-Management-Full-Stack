package com.gdtc.Employee.management.system.Service;

import com.gdtc.Employee.management.system.model.Employee;
import com.gdtc.Employee.management.system.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Registered Successfully...!!!";
    }

    public Integer logIn(String name, String password) {
        Employee employee = employeeRepo.findByFirstNameAndPassword(name, password);
        if (employee != null ){
            return employee.getId();
        }
        else {
           return -1;
        }
    }

    public Employee getEmpById(Integer id) {
        return employeeRepo.findById(id).get();
    }

    public String updateEmp(Employee employee) {
        if(employeeRepo.findById(employee.getId()).isPresent()) {
            employeeRepo.save(employee);
            return "Employee updated successfully...!!!";
        }
        else {
            throw new InputMismatchException("Invalid Details");
        }
    }
}
