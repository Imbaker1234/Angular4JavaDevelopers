package com.cityofhiddenapes.services;

import com.cityofhiddenapes.domains.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
