package com.example.productservice.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private int id;

    private String name;

    private Category category;
}
