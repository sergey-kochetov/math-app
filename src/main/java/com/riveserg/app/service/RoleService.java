package com.riveserg.app.service;

import com.riveserg.app.model.Role;
import com.riveserg.app.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService extends AbstractCrudService<Role, Long> implements CrudService<Role, Long> {
    private final RoleRepository repository;

    @Override
    public CrudRepository<Role, Long> getRepository() {
        return repository;
    }

}
