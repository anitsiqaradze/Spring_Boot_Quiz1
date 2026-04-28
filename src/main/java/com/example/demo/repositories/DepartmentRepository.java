package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dtos.DepartmentView;
import com.example.demo.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


//@Query("SELECT DISTINCT d FROM Department d JOIN FETCH d.employees")
// @Query(
//     value="SELECT d.department_name, e.first_name, e.last_name FROM departments d JOIN employees e ON e.department_id = d.department_id",
//     nativeQuery=true
// )
// @Query()
// List<DepartmentInfo> findAllWithEmployees();

@Query(value = """
    SELECT d.department_name AS departmentName,
           e.first_name      AS firstName,
           e.last_name       AS lastName
    FROM departments d
    INNER JOIN employees e ON e.department_id = d.department_id
    """, nativeQuery = true)
List<DepartmentView> findAllWithEmployees();



}
