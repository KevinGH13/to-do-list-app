package com.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todolist.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer>{

}
