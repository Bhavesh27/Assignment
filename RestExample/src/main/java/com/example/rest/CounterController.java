package com.example.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.CounterService;

/**
 * Controller
 * Simple Get Request to increment the number
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CounterController {
	
	private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    CounterService counterService;

    @RequestMapping("/counter")
    public Counter library() {
        return counterService.incrementCount(new Counter(1,counter.incrementAndGet()));
    }
}
