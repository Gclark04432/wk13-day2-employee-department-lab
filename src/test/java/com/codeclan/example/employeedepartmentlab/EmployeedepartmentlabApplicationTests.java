package com.codeclan.example.employeedepartmentlab;

import com.codeclan.example.employeedepartmentlab.models.Department;
import com.codeclan.example.employeedepartmentlab.models.Employee;
import com.codeclan.example.employeedepartmentlab.repositories.DepartmentRepository;
import com.codeclan.example.employeedepartmentlab.repositories.EmployeeRepository;
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
		Employee employee1 = new Employee("Doris", "Ramsay", "B1234");
		employeeRepository.save(employee1);
	}

}
