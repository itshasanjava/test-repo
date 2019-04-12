package org.cetpa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person 
{
	private int id;
	private String name, address;
	private float age;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column
	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	public Person() {
	}

	public Person(int id, String name, String address, float age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
}