package reviewssite.reviewssite;

public class Review {

	private int id;
	private String dish;
	private String imageUrl;
	private String cuisine;
	private String review;
	private String restaurant;
	private int rating;
	
	public Review(int id, String dish, String imageUrl, String cuisine, String review, String restaurant, int rating) {
		this.id=id;
		this.dish=dish;
		this.imageUrl=imageUrl;
		this.cuisine=cuisine;
		this.review=review;
		this.restaurant=restaurant;
		this.rating=rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setDescription(String restaurant) {
		this.restaurant = restaurant;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
