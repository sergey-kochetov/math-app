package com.riveserg.app.controller.rest;

import com.riveserg.app.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

public abstract class CrudRestController<E, K> {
    abstract CrudService<E, K> getService();

    @PostMapping
    public ResponseEntity<E> create(@RequestBody E entity) {
        getService().create(entity);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> findById(@PathVariable(name = "id") K id) {
        E entity = getService().findById(id);

        if (Objects.isNull(entity)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }

    @GetMapping
    public ResponseEntity<List<E>> findAll() {
        List<E> entities = getService().findAll();

        return ResponseEntity.ok(entities);
    }

    @PutMapping
    public ResponseEntity<E> update(@RequestBody E entity) {
        E update = getService().update(entity);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "id") K id) {
        E entity = getService().findById(id);
        if (Objects.isNull(entity)) {
            return ResponseEntity.notFound().build();
        }
        getService().delete(entity);
        return ResponseEntity.noContent().build();
    }

}
