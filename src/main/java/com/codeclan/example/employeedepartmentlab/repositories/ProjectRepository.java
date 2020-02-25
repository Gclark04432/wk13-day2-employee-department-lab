package com.codeclan.example.employeedepartmentlab.repositories;

import com.codeclan.example.employeedepartmentlab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
