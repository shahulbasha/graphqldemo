package org.shahul.graphql.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private int id;
	private String name;
	private List<Review> reviews;
	
	

	public Movie(int id, String name, List<Review> reviews) {
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Review> getReviews() {
		if(reviews==null) {
			return new ArrayList<>();
		}
		return reviews;
	}
	
	
}
