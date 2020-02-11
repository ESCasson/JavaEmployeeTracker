package com.example.codeclan.EmployeeDepartmentProject;

import com.example.codeclan.EmployeeDepartmentProject.models.Department;
import com.example.codeclan.EmployeeDepartmentProject.models.Employee;
import com.example.codeclan.EmployeeDepartmentProject.models.Project;
import com.example.codeclan.EmployeeDepartmentProject.repositories.DepartmentRepository;
import com.example.codeclan.EmployeeDepartmentProject.repositories.EmployeeRepository;
import com.example.codeclan.EmployeeDepartmentProject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeDepartmentProjectApplicationTests {

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
	public void createEmployee(){
		Department department = new Department("Sales");
		departmentRepository.save(department);
		Employee employee = new Employee("Billy", "Bob", 123, department);
		employeeRepository.save(employee);
	}

	@Test
	public void createProject(){
		Project project = new Project("Onboard The Big Whale", 14);
		projectRepository.save(project);

	}

	@Test
	public void addEmployeesToProject(){
		Project project = new Project("Onboard The Big Whale", 14);
		Department department = new Department("Sales");
		departmentRepository.save(department);
		Employee employee = new Employee("Billy", "Bob", 123, department);
		employeeRepository.save(employee);
		project.addEmployee(employee);
		projectRepository.save(project);



	}

}
