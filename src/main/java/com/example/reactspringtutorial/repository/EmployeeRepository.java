package com.example.reactspringtutorial.repository;

import com.example.reactspringtutorial.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
