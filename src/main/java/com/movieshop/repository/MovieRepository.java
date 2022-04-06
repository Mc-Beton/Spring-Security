package com.movieshop.repository;

import com.movieshop.domain.Movie;
import java.util.List;

public interface MovieRepository {

    List<Movie> findAll();
    void save(Movie movie);
    void deleteById(int movieId);
}