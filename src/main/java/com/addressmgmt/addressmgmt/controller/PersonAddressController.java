package com.addressmgmt.addressmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.addressmgmt.addressmgmt.entity.Person;
import com.addressmgmt.addressmgmt.repository.PersonCrudRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/api/v1/person")
public class PersonAddressController {
	
	@Autowired
	PersonCrudRepository personCrudRepository;
	
	@GetMapping(value = "/",  produces = "application/json")
	public Flux<Person> getAllPersons() {
		return personCrudRepository.findAll();
	}
	
	@GetMapping(value= "/{id}",  produces = "application/json")
	public Mono<Person> getPerson(@PathVariable int id) {
		return personCrudRepository.findById(id);
	}
	
	@PostMapping(value= "/", consumes= "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<Person> createPerson(@RequestBody Person person) {
		return personCrudRepository.save(person);
	}
	
	@PutMapping(value= "/{id}",  consumes = "application/json")
	public Mono<Person> updatePerson(@PathVariable int id, @RequestBody Person person) {
		return personCrudRepository.save(person);
	}
	
	@DeleteMapping(value= "/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Mono<Void> deletePerson(@PathVariable int id) {
		return personCrudRepository.deleteById(id);
	}
}
