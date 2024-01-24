package com.gdtc.Employee.management.system.controller;

import com.gdtc.Employee.management.system.Service.LeaveService;
import com.gdtc.Employee.management.system.model.Leave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leave")
public class LeaveController {

    @Autowired
    LeaveService leaveService;
    @GetMapping()
    List<Leave> getAllLeaves(){
        return leaveService.getAllLeaves();
    }
    @PostMapping()
    String createLeave(@RequestBody Leave leave){
        return leaveService.createLeave(leave);
    }

    @PutMapping()
    String updateStatus(@RequestBody Leave leave){
        return leaveService.updateStatus(leave);
    }


}
