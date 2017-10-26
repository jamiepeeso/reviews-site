package reviewssite.reviewssite;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	

	Map<Integer, Review> reviews = new HashMap<Integer, Review>();
	

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(int id) {
		return reviews.get(id);
	}
	public ReviewRepository(){
		Review dirtyFranks = new Review(1, "The Glenn Beck", "images/hotdog.jpg", "American",
				"This place was hoppin at the lunch hour! A few people looked like they were on lunch break from work, but most people seemed like they were trying it for the first time. I saw families, young adults, older folks. It definitely attracts all kinds of people!", "Dirty Frank\'s", 4);
		//Review fortune = new Review(2, null, null, null, null, null, 0);
		//Review adriatico = new Review(3, null, null, null, null, null, 0);
		reviews.put(1, dirtyFranks);
		
	}
}
