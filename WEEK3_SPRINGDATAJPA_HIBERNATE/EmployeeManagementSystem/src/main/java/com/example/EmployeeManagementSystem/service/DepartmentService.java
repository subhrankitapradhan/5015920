package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    
    public Department updateDepartment(Long id, Department departmentDetails) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        department.setName(departmentDetails.getName());

        return departmentRepository.save(department);
    }

    
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        departmentRepository.delete(department);
    }
}
