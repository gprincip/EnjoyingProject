package com.enjoying.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class radnik {
	
	@Id
	private int id;
	
	private String name;

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

	public radnik(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public radnik(String name) {
		super();
		this.name = name;
	}
	
	public radnik() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Student [id=%s, name=%s]", id, name);

	}
}
