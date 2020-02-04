package com.charl.datazone.project.repositories;

import java.util.List;

public interface ICRUD<T> {

    List<T> findAll() throws Exception;
    T getById(Integer id) throws Exception;
    void save(T obj);
    void updateById(T obj, Integer id);
    void deleteById(Integer id);

}
