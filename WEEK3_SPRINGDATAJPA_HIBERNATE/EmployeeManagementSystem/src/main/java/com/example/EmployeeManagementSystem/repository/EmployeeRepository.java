package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeProjection;

import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    
    List<Employee> findByName(String name);

   
    Employee findByEmail(String email);

    
    long countByDepartmentId(Long departmentId);

  
    boolean existsByEmail(String email);
    
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    
    @Query(value = "SELECT * FROM employees e WHERE e.salary > :salary", nativeQuery = true)
    List<Employee> findEmployeesWithSalaryGreaterThan(@Param("salary") double salary);
    
    Page<Employee> findAll(Pageable pageable);

    @Query("SELECT e FROM Employee e")
    List<EmployeeProjection> findAllEmployeeProjections();
    
    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.name, e.email) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeDTOs();
}
