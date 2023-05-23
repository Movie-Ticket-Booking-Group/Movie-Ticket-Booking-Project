package com.cinema_package.cinema_project;

import java.time.LocalDate;

public class BookingHistory {
        private int id;
        private String title;
        private String director;
        private String description;
        private String genre;
        private LocalDate date;
        private String location;
        private int bookedTickets;
        private int totalPrice;



    public BookingHistory(int id, String title, String director, String description, String genre, LocalDate date, String location, int bookedTickets, int totalPrice) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.description = description;
        this.genre = genre;
        this.date = date;
        this.location = location;
        this.bookedTickets = bookedTickets;
        this.totalPrice = totalPrice;
    }

    public BookingHistory() {}

        public int getId() {return id;}

        public void setId(int id) {this.id = id;}

        public String getTitle() {return title;}

        public void setTitle(String title) {this.title = title;}

        public String getDirector() {return director;}

        public void setDirector(String director) {this.director = director;}

        public String getDescription() {return description;}

        public void setDescription(String description) {this.description = description;}

        public String getGenre() {return genre;}

        public void setGenre(String genre) {this.genre = genre;}

        public LocalDate getDate() {return date;}

        public void setDate(LocalDate date) {this.date = date;}

        public String getLocation() {return location;}

        public void setLocation(String location) {this.location = location;}

        public int getBookedTickets() {return bookedTickets;}

        public void setBookedTickets(int bookedTickets) {this.bookedTickets = bookedTickets;}

        public int getTotalPrice() {return totalPrice;}

        public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}
}


