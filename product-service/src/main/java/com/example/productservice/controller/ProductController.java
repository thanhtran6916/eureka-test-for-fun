package com.example.productservice.controller;

import com.example.productservice.model.Category;
import com.example.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ICategoryController categoryController;

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iphone 8", null));
        products.add(new Product(1, "iphone 9", null));
        products.add(new Product(1, "iphone 10", null));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/update")
    public ResponseEntity<List<Product>> updateCategory() {
        Category category = categoryController.findById();
        products.get(1).setCategory(category);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
