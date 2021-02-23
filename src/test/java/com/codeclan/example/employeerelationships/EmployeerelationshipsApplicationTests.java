package com.codeclan.example.employeerelationships;

import com.codeclan.example.employeerelationships.models.Department;
import com.codeclan.example.employeerelationships.models.Employee;
import com.codeclan.example.employeerelationships.models.Project;
import com.codeclan.example.employeerelationships.repositories.DepartmentRepository;
import com.codeclan.example.employeerelationships.repositories.EmployeeRepository;
import com.codeclan.example.employeerelationships.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeerelationshipsApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Plumbing");
		departmentRepository.save(department);
		Employee employee = new Employee("Super", "Mario", "SUP123MAR456", department);
		employeeRepository.save(employee);
	}

	@Test
	public void createEmployeesAndProjects(){
		Department department = new Department("Plumbing");
		departmentRepository.save(department);
		Employee employee = new Employee("Super", "Mario", "SUP123MAR456", department);
		employeeRepository.save(employee);

		Project project = new Project("Finding Peach", 5);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
