package com.todolist.entities;

import javax.persistence.*;

@Entity
@Table(name = "list")
public class Lists {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Lists() {
		
	}
	
	public Lists(int id, String name) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lists other = (Lists) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
