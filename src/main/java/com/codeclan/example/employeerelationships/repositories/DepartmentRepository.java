package com.codeclan.example.employeerelationships.repositories;

import com.codeclan.example.employeerelationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
