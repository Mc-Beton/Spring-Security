package com.movieshop.service;

import com.movieshop.domain.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    void addMovie(Movie movie);
    void deleteMovie(int movieId);
}
