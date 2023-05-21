package com.cinema_package.cinema_project;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @PostMapping
    public void addMovie(@RequestBody CinemaProjectApplication.NewMovieRequest request){
        Movie movie = new Movie();
        movie.setDescription(request.description());
        movie.setDirector(request.director());
        movie.setGenre(request.genre());
        movie.setTitle(request.title());
        movieRepository.save(movie);

    }

    @DeleteMapping("{movieId}")
    public void deleteMovie(@PathVariable("movieId") Integer id){
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie ID: " + id));

        movieRepository.delete(movie);
    }

    @PutMapping("{movieId}")
    public void updateMovie(@PathVariable("movieId") Integer id,
                            @RequestBody CinemaProjectApplication.NewMovieRequest request){

        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie ID: " + id));

        movie.setDescription(request.description());
        movie.setDirector(request.director());
        movie.setGenre(request.genre());
        movie.setTitle(request.title());

        movieRepository.save(movie);
    }


}
