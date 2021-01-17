package com.todolist.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entities.Task;
import com.todolist.repository.TaskRepository;

@Service
public class TaskService implements TaskRepository{
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public <S extends Task> S save(S entity) {
		return taskRepository.save(entity);
	}

	@Override
	public <S extends Task> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Task> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Task> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		taskRepository.deleteById(id);
	}

	@Override
	public void delete(Task entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Task> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
