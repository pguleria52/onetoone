package com.map.onetonejpa.controller;


import com.map.onetonejpa.entity.Address;
import com.map.onetonejpa.entity.Employee;
import com.map.onetonejpa.repository.AddressRepository;
import com.map.onetonejpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
        employeeRepository.saveAll(empData);
        return ResponseEntity.ok("DataSaved");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    }

