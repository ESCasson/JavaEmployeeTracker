package com.example.codeclan.EmployeeDepartmentProject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "departments")
public class Department {

    @Column(name = "name")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();

    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}