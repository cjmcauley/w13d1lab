package com.example.EmployeeTracking.EmployeeTracking.repositories;

import com.example.EmployeeTracking.EmployeeTracking.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
