package com.riveserg.app.controller.rest;

import com.riveserg.app.model.User;
import com.riveserg.app.service.CrudService;
import com.riveserg.app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserRestController extends CrudRestController<User, Long> {
    private final UserService service;

    @Override
    CrudService<User, Long> getService() {
        return service;
    }
}
