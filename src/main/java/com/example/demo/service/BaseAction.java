package com.example.demo.service;

import java.util.List;
import java.util.Objects;

public interface BaseAction<T> {
    T save(T t);
    List<T> findAll();
    void delete(T t);
    T update(T t);
}
