# Movie-Ticket-Booking-Project
This is a project created by two students with a goal to develop a backend system for a movie ticket booking platform that allows users to search for movies, book tickets, make payment and view booking history. The project is built using Java and Spring Boot framework.

## Features
* Browse Movies: Users can view a list of available movies.
* Search and Filter: Users can search for movies based on title, date, location, genre and movie ID.
* Movie Details: Users can view detailed information about a specific movie, including title, director, description, genre, date, location, total seats, available seats, and price of ticket.
* Booking Tickets: Users can book tickets for a movie by specifying the movie ID, quantity of tickets, and total price.
* Booking History: Users can view their booking history, which includes details of movies they have booked, such as title, director, description, genre, date, location, booked tickets, and total price.
* Add/Delete/Update Movies: Admin users can add new movies, delete existing movies, and update movie information.

## Technologies
Java,
Spring Boot,
Spring Data JPA,
Postman,
PostgreSQL Database and
Docker

## API Endpoints
* GET /movie: Get a list of movies.
* GET /movie/{id}: Get detailed information about a specific movie.
* GET /movie?genre=Drama: Get a list of movies based on genre.
* GET /movie?date=2024-05-10: Get a list of movies based on date.
* GET /movie?title=Whiplash: Get a list of movies based on title.
* GET /movie?location=Cineplexx: Get a list of movies based on location.
* GET /movie/booking/history: Get booking history.
* POST /movie: Add a new movie.
* POST /movie/booking/{movieId}/{tickets}/{payment}: Create a new booking.
* DELETE /movie/{movieId}: Delete a movie.
* PUT /movie/{movieId}: Update movie information.
