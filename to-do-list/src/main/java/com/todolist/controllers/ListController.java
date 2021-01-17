package com.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entities.Lists;
import com.todolist.services.ListService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ListController {

	@Autowired
	private ListService listService;
	
	@GetMapping("/lists")
	public <S extends Lists> S save(@RequestBody S list) {
		return listService.save(list);
	}
	
	@DeleteMapping("/lists/{id}")
	public void deleteById(@PathVariable Integer id) {
		listService.deleteById(id);
	}
	
//	@PutMapping("/lists")
//	public Lists updateList(@RequestBody Lists list) {
//		return listService.updateList(list);
//	}
//	
}
