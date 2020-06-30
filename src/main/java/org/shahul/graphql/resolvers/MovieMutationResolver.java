package org.shahul.graphql.resolvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.shahul.graphql.model.Movie;
import org.shahul.graphql.model.Review;
import org.shahul.graphql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class MovieMutationResolver implements GraphQLMutationResolver {

	@Autowired
	MovieService movieService;
	
	//create a movie
	public List<Movie> createMovie(String name,String reviewComment) {		
		 Movie movie=new Movie(movieService.getMovies().size(),name,new ArrayList<>(Arrays.asList(new Review(1,reviewComment))));
		 movieService.getMovies().add(movie);
		 return movieService.getMovies();
	}
	
	//add a new Review to an existing movie
	public Movie addReview(int id,String reviewComment) {
				Movie movie = movieService.getMovieById(id);
				movie.getReviews().add(new Review(movie.getReviews().size(),reviewComment));
				return movie;
	}
}
