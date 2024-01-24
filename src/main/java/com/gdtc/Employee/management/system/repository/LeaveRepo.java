package com.gdtc.Employee.management.system.repository;

import com.gdtc.Employee.management.system.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo  extends JpaRepository<Leave,Integer> {
}
