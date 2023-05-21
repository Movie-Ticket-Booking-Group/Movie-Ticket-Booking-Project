package com.cinema_package.cinema_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

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