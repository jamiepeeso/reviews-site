package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

	@Resource
	private ReviewRepository reviews;
	
	@RequestMapping("/review")
	public String findOne(Model model) {
		model.addAttribute("modelReview", reviews.findOne(1));
		return "review-template";
	}


	@RequestMapping("/allreviews")
	public String showAll(Model model) {
		model.addAttribute("modelReview", reviews.findAll());
		//model.addAttribute("modelReviews", reviews);
		
		return "reviews-template";
	}

}
