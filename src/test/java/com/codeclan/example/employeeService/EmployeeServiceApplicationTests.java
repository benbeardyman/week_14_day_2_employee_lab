package com.codeclan.example.employeeService;

import com.codeclan.example.employeeService.models.Brief;
import com.codeclan.example.employeeService.models.Department;
import com.codeclan.example.employeeService.models.Employee;
import com.codeclan.example.employeeService.models.Project;
import com.codeclan.example.employeeService.repositories.BriefRepository;
import com.codeclan.example.employeeService.repositories.DepartmentRepository;
import com.codeclan.example.employeeService.repositories.EmployeeRepository;
import com.codeclan.example.employeeService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	BriefRepository briefRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		briefRepository.deleteAll();
		employeeRepository.deleteAll();
		projectRepository.deleteAll();
		departmentRepository.deleteAll();

		Department parks = new Department("Parks And Recreations");
		departmentRepository.save(parks);

		Employee employee1 = new Employee("Lesley", "Knope", 8345, parks);
		Employee employee2 = new Employee("Ron", "Swanson", 6785, parks);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Project project1 = new Project("Big Project", 45);
		Project project2 = new Project("Less Big Project", 10);
		projectRepository.save(project1);
		projectRepository.save(project2);

		Brief brief1 = new Brief(employee1, project1);
		Brief brief2 = new Brief(employee2, project1);
		Brief brief3 = new Brief(employee1, project2);
		briefRepository.save(brief1);
		briefRepository.save(brief2);
		briefRepository.save(brief3);





	}

}
