package com.timzowen.springbootbackend.repository;

import com.timzowen.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // get all CRUDE Methods

}
