package com.example.EmployeeManagementSystem.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@Transactional
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    private Department department;

    @BeforeEach
    void setUp() {
        department = new Department();
        department.setName("Engineering");
        departmentRepository.save(department);
    }

    @Test
    void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");
        employee.setDepartment(department);

        Employee savedEmployee = employeeRepository.save(employee);

        assertNotNull(savedEmployee.getId());
        assertEquals("John Doe", savedEmployee.getName());
    }

    @Test
    void testFindEmployeeById() {
        Employee employee = new Employee();
        employee.setName("Jane Doe");
        employee.setEmail("jane.doe@example.com");
        employee.setDepartment(department);
        Employee savedEmployee = employeeRepository.save(employee);

        Optional<Employee> foundEmployee = employeeRepository.findById(savedEmployee.getId());

        assertTrue(foundEmployee.isPresent());
        assertEquals("Jane Doe", foundEmployee.get().getName());
    }

    @Test
    void testUpdateEmployee() {
        Employee employee = new Employee();
        employee.setName("Mike Smith");
        employee.setEmail("mike.smith@example.com");
        employee.setDepartment(department);
        Employee savedEmployee = employeeRepository.save(employee);

        savedEmployee.setName("Michael Smith");
        Employee updatedEmployee = employeeRepository.save(savedEmployee);

        assertEquals("Michael Smith", updatedEmployee.getName());
    }

    @Test
    void testDeleteEmployee() {
        Employee employee = new Employee();
        employee.setName("Alice Johnson");
        employee.setEmail("alice.johnson@example.com");
        employee.setDepartment(department);
        Employee savedEmployee = employeeRepository.save(employee);

        employeeRepository.deleteById(savedEmployee.getId());
        Optional<Employee> foundEmployee = employeeRepository.findById(savedEmployee.getId());

        assertFalse(foundEmployee.isPresent());
    }

    // Additional tests for custom queries can be added here
}
