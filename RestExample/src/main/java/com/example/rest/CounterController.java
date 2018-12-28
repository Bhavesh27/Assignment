package com.example.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.CounterService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CounterController {
	
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    CounterService counterService;

    @RequestMapping("/counter")
    public Counter library() {
    	long count = counter.incrementAndGet();
        return counterService.incrementCount(new Counter(count,count));
    }
//    @RequestMapping(value = "/library", method = RequestMethod.POST)
//    public String post(@RequestBody Library library) {
//    	System.out.println(library.toString());
//        //Library library = new Library(name.);
//    	return "Got data";
//    }
}
