package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

	@Data
	@Entity
	@Table(name = "authors")
	public class Author {
		
		@Id
		private long phoneNumber;
		private String firstName;
		private String lastName;
		private String city;

	}
