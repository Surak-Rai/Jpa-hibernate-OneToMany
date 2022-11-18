package com.example.practice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.Client;
import com.example.practice.entity.Item;
import com.example.practice.repo.ClientRepo;
import com.example.practice.repo.ItemRepo;

@RestController
@RequestMapping("/api")

public class Controller {
	
	@Autowired
	ClientRepo clientrepo;
	
	@Autowired
	ItemRepo itemrepo;
	
	@GetMapping("/get")
	public String Hellomsg() {
	return "Hello";
	}
	
	@PostMapping("save-data")
	public Client saveData(@RequestBody Client clientobj) {
		return clientrepo.save(clientobj);
	}
	
	@PostMapping("save-item")
	public Item saveData(@RequestBody Item clientobj) {
		return itemrepo.save(clientobj);
	}
	
}
