package com.movieshop.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Movie {
    String title;
    String type;
    int year;
}