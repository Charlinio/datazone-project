package com.charl.datazone.project.restcontrollers;

import com.charl.datazone.project.models.Movie;
import com.charl.datazone.project.services.MovieService;
import com.charl.datazone.project.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = UrlConstants.MOVIE)
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(path = UrlConstants.MOVIE_SELECT)
    private List<Movie> getMovies() {
        try {
            return movieService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @PostMapping(path = UrlConstants.MOVIE_INSERT)
    public void saveMovie(@RequestBody Movie movie) {
        movieService.save(movie);
    }

    @PutMapping(path = UrlConstants.MOVIE_UPDATE)
    public void updateMovie(@PathVariable Integer id, @RequestBody Movie movie) {
        movieService.updateById(movie, id);
    }

    @DeleteMapping(path = UrlConstants.MOVIE_DELETE)
    public void deleteMovie(@RequestBody Integer id) {
        movieService.deleteById(id);
    }

}
