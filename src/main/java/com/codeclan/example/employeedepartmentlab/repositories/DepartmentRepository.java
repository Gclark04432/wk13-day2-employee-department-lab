package com.codeclan.example.employeedepartmentlab.repositories;


import com.codeclan.example.employeedepartmentlab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
