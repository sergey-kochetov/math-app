package com.riveserg.app.controller.rest;

import com.riveserg.app.model.Task;
import com.riveserg.app.service.CrudService;
import com.riveserg.app.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/task")
public class TaskRestController extends CrudRestController<Task,Long> {
    private final TaskService service;

    @Override
    CrudService<Task, Long> getService() {
        return service;
    }
}
