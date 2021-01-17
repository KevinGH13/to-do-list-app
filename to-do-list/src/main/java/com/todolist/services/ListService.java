package com.todolist.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entities.Lists;
import com.todolist.repository.ListRepository;

@Service
public class ListService implements ListRepository{
	
	@Autowired
	private ListRepository listRepository;

	@Override
	public <S extends Lists> S save(S entity) {
		return listRepository.save(entity);
	}

	@Override
	public <S extends Lists> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Lists> findById(Integer id) {
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Lists> findAll() {
		return listRepository.findAll();
	}

	@Override
	public Iterable<Lists> findAllById(Iterable<Integer> ids) {
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
		listRepository.deleteById(id);
	}

	@Override
	public void delete(Lists entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Lists> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
