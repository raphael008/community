package com.github.raphael008.repository;

import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<E, T, ID> extends CrudRepository<T, ID> {
}
