package com.example.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
