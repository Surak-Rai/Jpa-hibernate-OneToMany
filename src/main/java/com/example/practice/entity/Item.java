package com.example.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Items")

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ItemId;
	private int  price;
	private  int qty;

}
