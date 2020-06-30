package org.shahul.graphql.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.shahul.graphql.model.Movie;
import org.shahul.graphql.model.Review;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private List<Movie> movieList;
	
	
	//Simulate a Database fetch
	@PostConstruct
	private void init() {
		movieList=new ArrayList<>();
		Review review=new Review(1,"Greatest Movie of All Time!!");
		Review review1=new Review(2,"The most sick ending..");
		Movie movie =new Movie(1, "The Usual Suspects", new ArrayList<>(Arrays.asList(review,review1)));
		
		Review review3=new Review(1,"Poor in every aspect!!");
		Review review4=new Review(2,"Very Average Movie. Waste of Time..");
		Movie movie2 =new Movie(2, "Artemis Fowl", new ArrayList<>(Arrays.asList(review3,review4)));
		
		Review review5=new Review(1,"Fun and Adventurous!!");
		Review review6=new Review(2,"A good Family movie..");
		Movie movie3 =new Movie(3, "Dora and the Lost City of Gold", new ArrayList<>(Arrays.asList(review5,review6)));
		movieList.add(movie);
		movieList.add(movie2);
		movieList.add(movie3);
	}
	
	public List<Movie> getMovies(){
		return movieList;
	}
	
	public Movie getMovieById(int id) {
		return movieList.stream().filter((movie)->movie.getId()==id).findAny().orElse(null);
	}
}
