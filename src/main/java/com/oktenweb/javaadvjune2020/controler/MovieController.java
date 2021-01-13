package com.oktenweb.javaadvjune2020.controler;

import com.oktenweb.javaadvjune2020.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {

    private List<Movie> movies = Arrays.asList(new Movie(1, "LoTR: RoTK", 186),
            new Movie(2, "Harry Potter: DH", 131),
            new Movie(3, "Deadpool", 115));

    @GetMapping(value = "/movies")


    public List<Movie> getAllMovies() {
        return movies;

    }

}
