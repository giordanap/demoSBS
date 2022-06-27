package com.examen.demoSBS.repository;

import com.examen.demoSBS.model.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    public Employee findByDni(String dni);
}
