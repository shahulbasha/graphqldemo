package org.shahul.graphql.service;

import java.util.Arrays;
import java.util.List;

import org.shahul.graphql.model.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private List<Movie> movieList=Arrays.asList(new Movie());
	public List<Movie> getMovies(){
		return movieList;
	}
	
	public Movie getMovieById(int id) {
		return movieList.stream().filter((movie)->movie.getId()==id).findAny().orElse(null);
	}
}
