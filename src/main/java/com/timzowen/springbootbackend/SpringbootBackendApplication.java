package com.timzowen.springbootbackend;

import com.timzowen.springbootbackend.model.Employee;
import com.timzowen.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Timz");
		employee.setLastName("Owen");
		employee.setEmailId("timzowen@andela.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Timz");
		employee1.setLastName("Owen");
		employee1.setEmailId("timzowen@andela.com");
		employeeRepository.save(employee1);

	}
}
