package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Author;
import com.example.demo.services.AuthorService;

@RestController
public class AuthorController {
	
	@Value("${server.port}")
	private String portNumber;
	
	@Autowired
	private AuthorService service;
	
//	@GetMapping(path="/authors")
//	public List<Author> getAll(){
//		
//		return this.service.getAll();
//	}
//	
	@GetMapping(path="/authors")
	public String getAll(){
		
		List<Author> list = this.service.getAll();
		
		return list.toString() + ":" + this.portNumber;
	}
	
	@PostMapping(path = "/authors")
	public ResponseEntity<Author> add(@RequestBody Author entity) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
	}
	
	@PutMapping(path = "/authors")
	public Author update(@RequestBody Author entity) {
		
		return this.service.add(entity);
	}
	
	
	
	@GetMapping(path="/authors/srch/firnam/{firstName}")
	public List<Author> getByFirstName(@PathVariable("firstName") String firstName){
		
		return this.service.getByFirstName(firstName);
	}
	
	@GetMapping(path="/authors/srch/city/{city}")
	public List<Author> getByCity(@PathVariable("city") String city){
		
		return this.service.getByCity(city);
	}
	

}
