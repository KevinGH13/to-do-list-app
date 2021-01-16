package com.todolist.controllers;

import com.todolist.dto.TodolistDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.services.TodolistService;

@RestController
public class todolistController {

	
	@Autowired
	private TodolistService todolistService;

    @GetMapping("/todolist")
    @ResponseBody
    public List<TodolistDTO> getAll() {
    	List<TodolistDTO> todolists = todolistService.getAll();
    	return todolists;
    }
}
