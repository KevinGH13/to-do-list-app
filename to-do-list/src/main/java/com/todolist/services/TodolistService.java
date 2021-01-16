package com.todolist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.dto.TodolistDTO;
import java.util.List;
import java.util.stream.Collectors;

import com.todolist.entities.*;
import com.todolist.repository.ListRepository;
import com.todolist.repository.TaskRepository;

@Service
public class TodolistService {

	@Autowired
	private ListRepository listRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	public List<TodolistDTO> getAll() {
		return ((List<Lists>) listRepository.findAll()).stream().map(this::convertDTO).collect(Collectors.toList());
		
	}
	
	public TodolistDTO convertDTO(Lists list) {
		TodolistDTO todolistDTO = new TodolistDTO();
		todolistDTO.setIdList(list.getId());
		todolistDTO.setNameList(list.getName());
		List<Task> tasks = getAllTasks();
		todolistDTO.setTasks(tasks);
		
		return todolistDTO;
	}
	
	private List<Task> getAllTasks() {
		return ((List<Task>) taskRepository.findAll()).stream().collect(Collectors.toList());
	}

}
