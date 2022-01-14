package com.example.cateogryservice.controller;

import com.example.cateogryservice.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryService {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "iphone"));
        categories.add(new Category(2, "samsung"));
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("1")
    public ResponseEntity<Category> findById() {
        return new ResponseEntity<>(new Category(1, "iphone"), HttpStatus.OK);
    }
}

