package com.sergioruy.springboottesting.repository;

import com.sergioruy.springboottesting.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
