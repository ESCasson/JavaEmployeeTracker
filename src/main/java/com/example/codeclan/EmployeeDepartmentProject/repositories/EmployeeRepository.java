package com.example.codeclan.EmployeeDepartmentProject.repositories;

import com.example.codeclan.EmployeeDepartmentProject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
