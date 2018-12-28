package com.example.rest.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.Counter;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {

}
