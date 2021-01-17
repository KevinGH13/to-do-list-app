package com.todolist.controllers;

import com.todolist.dto.TodolistDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todolist.services.TodolistService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class todolistController {

	
	@Autowired
	private TodolistService todolistService;

    @GetMapping("/todolist")
    public List<TodolistDTO> getAll() {
    	return todolistService.getAll();
    }
}