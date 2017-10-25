package reviewssite.reviewssite;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

	@Resource
	private Collection<ReviewRepository> reviews;

	@RequestMapping("/reviews")
	public String showAll(Model model) {
		Review dirtyFranks = new Review();
		model.addAttribute("modelReview", dirtyFranks);
		Review fortune = new Review();
		model.addAttribute("modelReview", fortune);
		Review adriatico = new Review();
		model.addAttribute("modelReview", adriatico);
		Collection<Review> reviews = Arrays.asList(dirtyFranks, fortune, adriatico);
		model.addAttribute("modelReviews", reviews);
		return "reviews-template";
	}

}
