package com.example.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.EmployeeManagementSystem.model.MyEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class MyEntityService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void batchInsert(List<MyEntity> entities) {
        int batchSize = 20; // This should match the batch size configured
        for (int i = 0; i < entities.size(); i++) {
            entityManager.persist(entities.get(i));
            if (i % batchSize == 0 && i > 0) {
                // Flush and clear to manage memory
                entityManager.flush();
                entityManager.clear();
            }
        }
        // Insert remaining entities
        entityManager.flush();
        entityManager.clear();
    }
}

