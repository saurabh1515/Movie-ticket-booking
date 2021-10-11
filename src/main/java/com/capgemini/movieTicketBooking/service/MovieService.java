package com.capgemini.movieTicketBooking.service;

import java.util.List;

import com.capgemini.movieTicketBooking.model.Movie;

public interface MovieService {
	
	Movie addMovie(Movie movie);
	Movie updateMovie(Movie movie);
	Movie removeMovie(Movie movie);
	Movie viewMovie(int movieId);
	List<Movie> viewMovieList();
	
}
