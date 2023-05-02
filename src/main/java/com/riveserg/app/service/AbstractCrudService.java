package com.riveserg.app.service;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCrudService<E, K> implements CrudService<E, K> {
    public abstract CrudRepository<E, K> getRepository();

    @Override
    public void create(E entity) {
        getRepository().save(entity);
    }

    @Override
    public E findById(K id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public List<E> findAll() {
        List<E> entities = new ArrayList<>();
        getRepository().findAll().forEach(entities::add);
        return entities;
    }

    @Override
    public E update(E entity) {
        return getRepository().save(entity);
    }

    @Override
    public void delete(E entity) {
        getRepository().delete(entity);
    }
}
