package com.movieshop.service;

import com.movieshop.repository.MovieRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MovieServiceConfiguration {

    @Bean
    MovieService movieService(MovieRepository movieRepository) {
        return new MovieServiceImpl(movieRepository);
    }
}
