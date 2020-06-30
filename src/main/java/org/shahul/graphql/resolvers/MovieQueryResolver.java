package org.shahul.graphql.resolvers;

import java.util.List;

import org.shahul.graphql.model.Movie;
import org.shahul.graphql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class MovieQueryResolver implements GraphQLQueryResolver {
	
	@Autowired
	MovieService movieService;

	public List<Movie> getMovies() {
		return movieService.getMovies();
	}
	
	public Movie getMovieById(int id) {
		return movieService.getMovieById(id);
	}
}
