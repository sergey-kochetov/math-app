package com.riveserg.app.service;

import com.riveserg.app.model.User;
import com.riveserg.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService extends AbstractCrudService<User, Long> implements CrudService<User, Long> {
    private final UserRepository repository;

    @Override
    public CrudRepository<User, Long> getRepository() {
        return repository;
    }
}
