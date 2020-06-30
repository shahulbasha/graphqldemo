package org.shahul.graphql.model;

public class Review {

	private int reviewId;
	private String reviewComment;
	
	
	public Review(int reviewId, String reviewComment) {
		this.reviewId = reviewId;
		this.reviewComment = reviewComment;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewComment() {
		return reviewComment;
	}
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	
	
}
