package com.malabargold.router.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="person1")
public class Person {
	@Column(name="id")
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	

	public Person(int id, String name) {		
		this.id = id;
		this.name = name;
	}
	
	public Person(String name){
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
