package com.example.rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Counter")
public class Counter {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
    private long counter;
	
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCounter() {
		return counter;
	}
	public void setCounter(long counter) {
		this.counter = counter;
	}
	@Override
	public String toString() {
		return "Counter [id=" + id + ", counter=" + counter + "]";
	}
	public Counter(long id, long counter) {
		super();
		this.id = id;
		this.counter = counter;
	}
	public Counter(long id) {
		super();
		this.id = id;
	}
	public Counter() {
		super();
	}
	
    
    

    
    
	
}
