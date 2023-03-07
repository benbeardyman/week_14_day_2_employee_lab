package com.codeclan.example.employeeService;

import com.codeclan.example.employeeService.models.Brief;
import com.codeclan.example.employeeService.models.Employee;
import com.codeclan.example.employeeService.models.Project;
import com.codeclan.example.employeeService.repositories.BriefRepository;
import com.codeclan.example.employeeService.repositories.EmployeeRepository;
import com.codeclan.example.employeeService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	BriefRepository briefRepository;
	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		Brief brief = new Brief();
		Project project = new Project("Big Project", 45, brief);
		Employee sandra = new Employee("Sandra", "Esquire", 8345, brief);
//		sandra.addBrief(brief);
		brief.setProject(project);
		brief.setEmployee(sandra);

		projectRepository.save(project);
		employeeRepository.save(sandra);
		briefRepository.save(brief);
	}

}
