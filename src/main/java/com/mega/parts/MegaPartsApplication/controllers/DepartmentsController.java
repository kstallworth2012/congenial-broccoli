package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.repositories.DepartmentsRepository;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController{


	private final DepartmentsRepository departmentsRepository;

    public DepartmentsController(DepartmentsRepository _departmentsRepository) {
        this.departmentsRepository = _departmentsRepository;
    }


    // Read All
    @GetMapping
    public Iterable<DepartmentsEntity> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentsEntity> getDepartmentById(@PathVariable Long id) {
        return departmentsRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}