package com.example.reactive.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("items")
public class Item {
    @Id
    private Long id;
    private String name;
    private double price;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
