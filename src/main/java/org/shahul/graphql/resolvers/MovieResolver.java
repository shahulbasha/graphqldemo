package org.shahul.graphql.resolvers;

import java.util.ArrayList;
import java.util.List;

import org.shahul.graphql.model.Movie;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class MovieResolver implements GraphQLQueryResolver {

	public List<Movie> getMovies() {
		return new ArrayList<>();
	}
}
