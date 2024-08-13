package com.example.EmployeeManagementSystem.controller;


import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagementSystem.model.MyEntity;
import com.example.EmployeeManagementSystem.service.MyEntityService;

@RestController
@RequestMapping("/api/entities")
public class MyEntityController {

    private final MyEntityService myEntityService;

    public MyEntityController(MyEntityService myEntityService) {
        this.myEntityService = myEntityService;
    }

    @PostMapping("/batch")
    public void batchInsert(@RequestBody List<MyEntity> entities) {
        myEntityService.batchInsert(entities);
    }
}


