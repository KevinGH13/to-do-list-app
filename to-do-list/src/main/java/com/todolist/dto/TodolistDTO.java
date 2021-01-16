package com.todolist.dto;

import com.todolist.entities.Task;
import java.util.List;

import java.io.Serializable;

public class TodolistDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idList;
	private String nameList;
	private List<Task> tasks;
	
	public TodolistDTO() {
		super();
	}

	public TodolistDTO(int idList, String nameList, List<Task> tasks) {
		super();
		this.idList = idList;
		this.nameList = nameList;
		this.tasks = tasks;
	}

	public int getIdList() {
		return idList;
	}

	public void setIdList(int idList) {
		this.idList = idList;
	}

	public String getNameList() {
		return nameList;
	}

	public void setNameList(String nameList) {
		this.nameList = nameList;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}


}
