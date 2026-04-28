package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Employee;
import com.example.demo.dtos.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    @Query("SELECT e.firstName AS firstName, e.lastName AS lastName, e.email AS email FROM Employee e")
    public List<EmployeeView> getEmployeeSummary();
    
}
