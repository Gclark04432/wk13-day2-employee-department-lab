package com.codeclan.example.employeedepartmentlab.repositories;

import com.codeclan.example.employeedepartmentlab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
