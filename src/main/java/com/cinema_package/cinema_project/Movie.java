package com.cinema_package.cinema_project;

import jakarta.persistence.*;

@Entity
@Table
public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_id_sequence",
            sequenceName = "movie_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_id_sequence"
    )
    private int id;
    private String title;
    private String director;
    private String description;
    private String genre;

    public Movie(int id, String title, String director, String description, String genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.description = description;
        this.genre = genre;
    }
    public Movie() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
