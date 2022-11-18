package com.example.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.practice.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer> {


}
