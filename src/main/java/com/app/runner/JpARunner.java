package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

@Component
public class JpARunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository repo;
       
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		System.out.println("from runner class");
		
		
		Employee e=repo.save(new Employee("aa","hyd"));
          
		System.out.println(e.getEmpId());
		repo.save(new Employee("aasa","delhi"));
		repo.save(new Employee("alam","kolkata"));
		repo.save(new Employee("alam","hyderabad"));
		repo.save(new Employee("ahhsjdksjkam","pune"));
		
	}
     
}
