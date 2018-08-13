package com.enjoying.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class radnik {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;

	@OneToOne(cascade=CascadeType.ALL)
	private Student student;
	
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

	public void setStudent(Student student) {
		this.student = student;
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
		return String.format("Radnik [id=%s, name=%s] " + student.toString(), id, name);

	}
}
