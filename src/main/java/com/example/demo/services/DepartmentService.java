package com.example.demo.services;

import com.example.demo.dtos.DepartmentInfo;
import com.example.demo.dtos.DepartmentView;
import com.example.demo.dtos.EmployeeInfo;
import com.example.demo.dtos.EmployeeView;
import com.example.demo.repositories.DepartmentRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;


    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }
 



//      public List<DepartmentInfo> findAllWithEmployees(){
//         return departmentRepository.findAllWithEmployees()
//         .stream()
//         .collect(Collectors.groupingBy(
//         DepartmentView::getDepartmentName,
//         LinkedHashMap::new,
//         Collectors.mapping(
//         row -> new EmployeeInfo(row.getFirstName(), row.getLastName()),  // ← manual mapping
//         Collectors.toList()
//     )
// ))



   public List<DepartmentInfo> findAllWithEmployees() {
    return departmentRepository.findAllWithEmployees()
        .stream()
        .collect(Collectors.groupingBy(
            DepartmentView::getDepartmentName,
            LinkedHashMap::new,            // ← preserves order
            Collectors.mapping(
                row -> new EmployeeInfo(row.getFirstName(), row.getLastName()),
                Collectors.toList()
            )
        ))
        .entrySet().stream()
        .map(entry -> new DepartmentInfo(entry.getKey(), entry.getValue()))
        .toList();
}
    
}
