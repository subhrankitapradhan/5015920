package com.example.EmployeeManagementSystem.repository;

import java.util.List;

import com.example.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepositoryCustom {

	List<Employee> findEmployeesByDepartmentName(String departmentName);

}
