package com.cinema_package.cinema_project;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String genre
    ) {return movieService.getAllMovies(title, date, location, genre);}

    @PostMapping
    public void addMovie(@RequestBody CinemaProjectApplication.NewMovieRequest movie) {
        movieService.addMovie(movie);
    }

    @DeleteMapping("/{movieId}")
    public void deleteMovie(@PathVariable("movieId") Integer id) {
        movieService.deleteMovie(id);
    }

    @PutMapping("/{movieId}")
    public void updateMovie(@PathVariable("movieId") Integer id, @RequestBody CinemaProjectApplication.NewMovieRequest movie) {
        movieService.updateMovie(id, movie);
    }

}