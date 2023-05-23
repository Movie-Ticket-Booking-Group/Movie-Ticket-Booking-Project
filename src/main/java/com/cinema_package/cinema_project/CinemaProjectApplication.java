package com.cinema_package.cinema_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@SpringBootApplication
@RestController
@RequestMapping("/movie")
public class CinemaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaProjectApplication.class, args);
	}

	record NewMovieRequest(
		String description,
		String director,
		String genre,
		String title,
		LocalDate date,
		String location,
		int totalSeats,
		int availableSeats,
		int price
		){}

}