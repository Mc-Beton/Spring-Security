package com.movieshop.service;

import com.movieshop.domain.Movie;
import com.movieshop.repository.MovieRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
    }
}
