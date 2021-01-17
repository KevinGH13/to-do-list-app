package com.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entities.Lists;
import com.todolist.services.ListService;

@RestController
@CrossOrigin(origins = "*")
public class ListController {

	@Autowired
	private ListService listService;
	
	@RequestMapping(value = "/lists", method = RequestMethod.POST)
	public <S extends Lists> S save(@RequestBody S list) {
		return listService.save(list);
	}
	
	@RequestMapping(value = "/lists/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id) {
		listService.deleteById(id);
	}
	
}
