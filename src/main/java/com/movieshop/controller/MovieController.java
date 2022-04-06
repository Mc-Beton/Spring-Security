package com.movieshop.controller;

import com.movieshop.domain.Movie;
import com.movieshop.domain.MovieDto;
import com.movieshop.mapper.MovieMapper;
import com.movieshop.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public void addMovie(@RequestBody MovieDto movieDto) {
        movieService.addMovie(MovieMapper.mapToMovie(movieDto));
    }

    @DeleteMapping(value = "/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
    }

}
