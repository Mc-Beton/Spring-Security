package com.movieshop.mapper;

import com.movieshop.domain.Movie;
import com.movieshop.domain.MovieDto;

import java.util.List;
import java.util.stream.Collectors;

public class MovieMapper {

    public static Movie mapToMovie(MovieDto movieDto) {
        return Movie.of(movieDto.getTitle(), movieDto.getType(), movieDto.getYear());
    }

    public static MovieDto mapToMovieDto(Movie movie) {
        return new MovieDto(movie.getTitle(), movie.getType(), movie.getYear());
    }

    public static List<MovieDto> mapToMovieDtoList(List<Movie> movieList) {
        return movieList.stream()
                .map(m -> new MovieDto(m.getTitle(), m.getType(), m.getYear()))
                .collect(Collectors.toList());
    }
}
