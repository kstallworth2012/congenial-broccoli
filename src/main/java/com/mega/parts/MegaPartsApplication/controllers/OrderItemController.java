package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities;
import com.mega.parts.MegaPartsApplication.repositories;


@RestController
@RequestMapping("/api/order-items")
public class OrderItemController{


		private final Repository Repository;

    public Controller(Repository _Repository) {
        this.Repository = _Repository;
    }


    // Read All
    @GetMapping
    public Iterable<Entity> getAll___() {
        return ____Repository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<User> get____ById(@PathVariable Long id) {
        return ___Repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}