package com.riveserg.app.controller.rest;

import com.riveserg.app.model.Role;
import com.riveserg.app.service.CrudService;
import com.riveserg.app.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/role")
public class RoleRestController extends CrudRestController<Role,Long> {
    private final RoleService service;

    @Override
    CrudService<Role, Long> getService() {
        return service;
    }
}
