package com.addressmgmt.addressmgmt.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.addressmgmt.addressmgmt.entity.Person;

import reactor.core.publisher.Flux;

@Repository
public interface PersonCrudRepository extends ReactiveCrudRepository<Person, Integer> {
}