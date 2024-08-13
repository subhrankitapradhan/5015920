package com.example.EmployeeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeProjection;

public interface EmployeeService {
    Employee save(Employee employee);
    Optional<Employee> findById(Long id);
    Employee update(Long id, Employee employee);
    void deleteById(Long id);
	List<Employee> getAllEmployees();
	Page<Employee> getPaginatedAndSortedEmployees(Pageable pageable);
	List<EmployeeProjection> getEmployeeProjections();
	List<EmployeeDTO> getEmployeeDTOs();
}