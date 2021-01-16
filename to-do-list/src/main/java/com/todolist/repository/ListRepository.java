package com.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todolist.entities.Lists;

@Repository
public interface ListRepository extends CrudRepository<Lists, Integer> {

}
