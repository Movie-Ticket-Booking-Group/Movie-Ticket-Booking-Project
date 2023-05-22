package com.cinema_package.cinema_project;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> filterMovies(String title, LocalDate date, String location, String genre) {
        List<Movie> movies = movieRepository.findAll();
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            boolean match = true;

            if (title != null && !movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                match = false;
            }
            if (date != null && !movie.getDate().isEqual(date)) {
                match = false;
            }
            if (location != null && !movie.getLocation().toLowerCase().contains(location.toLowerCase())) {
                match = false;
            }
            if (genre != null && !movie.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                match = false;
            }
            if (match) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }
    @GetMapping
    public List<Movie> getAllMovies(String title, LocalDate date, String location, String genre) {
        if (title == null && date == null && location == null && genre == null) {
            return movieRepository.findAll();
        } else {
            return filterMovies(title, date, location, genre);
        }
    }


    @PostMapping
    public void addMovie(@RequestBody CinemaProjectApplication.NewMovieRequest request){
        Movie movie = new Movie();
        movie.setDescription(request.description());
        movie.setDirector(request.director());
        movie.setGenre(request.genre());
        movie.setTitle(request.title());
        movie.setDate(request.date());
        movie.setLocation(request.location());
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
        movie.setDate(request.date());
        movie.setLocation(request.location());

        movieRepository.save(movie);
    }


}