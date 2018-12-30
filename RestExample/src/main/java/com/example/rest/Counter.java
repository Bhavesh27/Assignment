package com.example.rest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Counter")
public class Counter {

	/**
	 * Database Table Model
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private long counter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Counter(int id, long counter) {
		super();
		this.id = id;
		this.counter = counter;
	}

	public Counter() {
		super();
	}

}
