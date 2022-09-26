package com.timzowen.springbootbackend.controller;

import com.timzowen.springbootbackend.exception.ResourceNotFoundException;
import com.timzowen.springbootbackend.model.Employee;
import com.timzowen.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // RESTAPIs for employee;
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    // build get employer by ID
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("No such employee with ID: " + id));
        return ResponseEntity.ok(employee);
    }
}
