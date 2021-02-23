package com.codeclan.example.employeerelationships.repositories;

import com.codeclan.example.employeerelationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
