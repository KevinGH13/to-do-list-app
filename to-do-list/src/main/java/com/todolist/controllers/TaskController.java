package com.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entities.Task;
import com.todolist.services.TaskService;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {

	@Autowired
	private TaskService taskService;
	

	@RequestMapping(value = "/task", method = RequestMethod.POST)
	public <S extends Task> S save(@RequestBody S task) {
		return taskService.save(task);
	}
	
	@RequestMapping(value = "/task/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id) {
		taskService.deleteById(id);
	}
	
	/*
	 * @PutMapping("/task") public Task update(@RequestBody Task task) { return
	 * taskService.update(task); }
	 */
}
