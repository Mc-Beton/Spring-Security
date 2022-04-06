package com.movieshop.repository;

import com.movieshop.domain.Movie;

import java.util.ArrayList;
import java.util.List;

class InMemoryMovieRepository implements MovieRepository{

    private List<Movie> movieList = new ArrayList<>();

    @Override
    public void save(Movie movie) {
        movieList.add(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieList;
    }

    @Override
    public void deleteById(int movieId) {
        movieList.remove(movieId);
    }
}
