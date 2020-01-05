package com.iteco.temp.repos;

import com.iteco.temp.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called taskRepo
// CRUD refers Create, Read, Update, Delete
public interface TaskRepo extends CrudRepository<Task, Long> {
    //List<Task> findByName(String name); // здесь не нужен, нужен был для поиска по имени
}
