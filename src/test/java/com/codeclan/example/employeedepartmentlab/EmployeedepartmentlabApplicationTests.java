package com.codeclan.example.employeedepartmentlab;

import com.codeclan.example.employeedepartmentlab.models.Department;
import com.codeclan.example.employeedepartmentlab.models.Employee;
import com.codeclan.example.employeedepartmentlab.models.Project;
import com.codeclan.example.employeedepartmentlab.repositories.DepartmentRepository;
import com.codeclan.example.employeedepartmentlab.repositories.EmployeeRepository;
import com.codeclan.example.employeedepartmentlab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeedepartmentlabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddDepartment(){
		Department department1 = new Department("HR");
		departmentRepository.save(department1);
	}

	@Test
	public void canAddEmployee(){
		Department department1 = new Department("HR");
		departmentRepository.save(department1);
		Employee employee1 = new Employee("Doris", "Ramsay", "B1234", department1);
		employeeRepository.save(employee1);
	}

	@Test
	public void canAddProject(){
		Project project1 = new Project("Update Contracts", 14);
		projectRepository.save(project1);
	}

	@Test
	public void canAddEmployeeToProject(){
		Department department2 = new Department("IT");
		departmentRepository.save(department2);

		Employee employee2 = new Employee("Brian", "Smith", "A8746", department2);
		employeeRepository.save(employee2);

		Project project2 = new Project("Upgrade servers", 150);
		projectRepository.save(project2);

		project2.addEmployee(employee2);
		projectRepository.save(project2);
	}

}
