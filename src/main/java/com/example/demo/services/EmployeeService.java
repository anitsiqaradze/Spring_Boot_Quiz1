package com.example.demo.services;

import com.example.demo.repositories.EmployeeRepository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.EmployeeView;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeView> getEmployeeSummary(){
        return employeeRepository.getEmployeeSummary();
    }

    
}
