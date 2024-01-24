package com.gdtc.Employee.management.system.Service;

import com.gdtc.Employee.management.system.model.Leave;
import com.gdtc.Employee.management.system.repository.LeaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {
    @Autowired
    LeaveRepo leaveRepo;
    public List<Leave> getAllLeaves() {
        return leaveRepo.findAll();
    }

    public String createLeave(Leave leave) {
        leaveRepo.save(leave);
        return "leave has been submitted succesfully";
    }

    public String updateStatus(Leave leave) {
        leaveRepo.save(leave);
                return "status updated";
    }
}
