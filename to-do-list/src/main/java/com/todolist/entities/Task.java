package com.todolist.entities;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "complete")
	private boolean complete;
	
	@ManyToOne()
	@JoinColumn(name="fk_id_list")
	private Lists list;

	public Task() {
		super();
	}

	public Task(int id, String name, boolean complete, Lists list) {
		super();
		this.id = id;
		this.name = name;
		this.complete = complete;
		this.list = list;
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

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public Lists getList() {
		return list;
	}

	public void setList(Lists list) {
		this.list = list;
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
		Task other = (Task) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

