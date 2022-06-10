package com.br.condominio.framework;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends JpaRepository<E, I>, E, I> {

    protected final T repository;

    public AbstractService(T repository) {
        this.repository = repository;
    }

    public List<E> findAll() {
        return repository.findAll();
    }

    public Optional<E> findById(I id) {
        return repository.findById(id);
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public void deleteById(I id) {
        repository.deleteById(id);
    }

}
