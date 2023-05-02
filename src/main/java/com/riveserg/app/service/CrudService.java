package com.riveserg.app.service;

import java.util.List;

public interface CrudService<E, K> {
    void create(E entity);
    E findById(K id);
    List<E> findAll();
    E update(E entity);
    void delete(E entity);
}
