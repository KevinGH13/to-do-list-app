package com.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entities.Task;
import com.todolist.services.TaskService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TaskController {

	@Autowired
	private TaskService taskService;
	

	@PostMapping("/task")
	public <S extends Task> S save(@RequestBody S task) {
		return taskService.save(task);
	}
	
	@DeleteMapping("/task/{id}")
	public void deleteById(@PathVariable Integer id) {
		taskService.deleteById(id);
	}
	
	/*
	 * @PutMapping("/task") public Task update(@RequestBody Task task) { return
	 * taskService.update(task); }
	 */
}
