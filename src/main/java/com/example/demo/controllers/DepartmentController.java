package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DepartmentService;
import com.example.demo.dtos.DepartmentInfo;
import com.example.demo.entities.Department;;

@RestController()
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }


    @GetMapping("/all/employees")
    public List<DepartmentInfo> findAllWithEmployees(){
        return this.departmentService.findAllWithEmployees();
    }
    
    
}
