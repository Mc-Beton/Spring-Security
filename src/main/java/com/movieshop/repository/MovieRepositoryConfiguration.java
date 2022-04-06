package com.movieshop.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MovieRepositoryConfiguration {

    @Bean
    MovieRepository movieRepository() {
        return new InMemoryMovieRepository();
    }
}
