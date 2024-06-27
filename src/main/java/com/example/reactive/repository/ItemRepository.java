package com.example.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.reactive.entity.Item;

@Repository
public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {
}