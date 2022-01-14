package com.example.productservice.controller;

import com.example.productservice.model.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "category-service")
public interface ICategoryController {

    @GetMapping("/categories")
    List<Category> findAll();

    @GetMapping("/categories/1")
    Category findById();
}
