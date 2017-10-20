package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class ReviewController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayGreeting(HttpSession session) {
		List<Review> allReviews = reviewDao.getAllReviews();
		session.setAttribute("reviews", allReviews);
		return "productReview";
	}
	
	@RequestMapping(path="/postOnForum", method=RequestMethod.GET)
	public String displayPostToForumInputPage(){
		//
		//
		return "postOnForum";
	}
	
	@RequestMapping(path="/createPost", method=RequestMethod.POST)
	public String createThePost(@RequestParam String username, 
								@RequestParam int rating, 
								@RequestParam String title, 
								@RequestParam String text,
								ModelMap modelHolder){
		Review review = new Review(username, rating, title, text);
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return "redirect:/";
	}
}
