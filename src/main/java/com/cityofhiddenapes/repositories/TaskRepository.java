package com.cityofhiddenapes.repositories;

import com.cityofhiddenapes.domains.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
