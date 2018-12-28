package com.example.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rest.Counter;
import com.example.rest.service.CounterRepository;
import com.example.rest.service.CounterService;

@Service
@Transactional
public class CounterServiceImpl implements CounterService{
	
	@Autowired
	CounterRepository counterRepository;

	@Override
	public Counter incrementCount(Counter count) {
		// TODO Auto-generated method stub
		return counterRepository.save(count);
	}
	
	

}
