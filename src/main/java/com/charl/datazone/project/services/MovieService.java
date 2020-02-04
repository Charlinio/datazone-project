package com.charl.datazone.project.services;

import com.charl.datazone.project.models.Movie;
import com.charl.datazone.project.repositories.ICRUD;
import com.charl.datazone.project.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements ICRUD<Movie> {

    @Autowired
    MovieRepository repository;


    @Override
    public List<Movie> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Movie getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public void save(Movie obj) {
        repository.save(obj);
    }

    @Override
    public void updateById(Movie obj, Integer id) {
        obj.setId(id);
        repository.save(obj);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
