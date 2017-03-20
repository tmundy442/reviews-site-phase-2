package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class ReviewController {
	@Resource
	private ReviewRepository repository;

	@Resource
	private CategoryRepository catrepository;

	@RequestMapping("/review")
	public String displayReview(@RequestParam(value = "id") long id, Model model) {
		Review review = repository.findOne(id);
		model.addAttribute("selectedReview", review);
		return "review-view";
	}

	@RequestMapping("/Category")
	public String displayCategory(@RequestParam(value = "id") long id, Model model) {
		Category category = catrepository.findOne(id);
		model.addAttribute("selectedCategory", category);
		return "category-view";
	}

	@RequestMapping("/allReviews")
	public String displayAll(Model model) {
		Iterable<Review> reviews = repository.findAll();
		model.addAttribute("reviews", reviews);
		return "all-reviews-view";
	}

	@RequestMapping("/Categories")
	public String displayCategories(Model model) {
		Iterable<Category> categories = catrepository.findAll();
		model.addAttribute("categories", categories);
		return "categories-view";
	}

}