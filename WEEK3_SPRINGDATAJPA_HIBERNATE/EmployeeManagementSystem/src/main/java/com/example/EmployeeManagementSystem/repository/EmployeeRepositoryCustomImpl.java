package com.example.EmployeeManagementSystem.repository;

import java.util.List;

import com.example.EmployeeManagementSystem.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findEmployeesByDepartmentName(String departmentName) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByDepartmentName", Employee.class);
        query.setParameter("departmentName", departmentName);
        return query.getResultList();
    }
}
