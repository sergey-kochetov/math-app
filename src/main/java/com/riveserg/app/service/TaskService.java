package com.riveserg.app.service;

import com.riveserg.app.model.Task;
import com.riveserg.app.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskService extends AbstractCrudService<Task, Long> implements CrudService<Task, Long> {
    private final TaskRepository repository;

    @Override
    public CrudRepository<Task, Long> getRepository() {
        return repository;
    }
}
