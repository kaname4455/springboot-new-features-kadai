package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.form.ReviewForm;

@Controller
public class ReviewController {

    @GetMapping("/reviews")
    public String showReviewList(Model model) {
        // レビュー一覧表示用
        return "reviewList";
    }
    
    @GetMapping("@{/houses/__${houseId}__/reviews")
    public String houseReview(Model model, String houseId) {
        return "reviewrist";
        
    } 

    @GetMapping("/houses/reviewForm")
    public String newReview(@PathVariable House house, Model model) {
        model.addAttribute("reviewForm", new ReviewForm());
        return "houses/reviewForm";
    
    }    
    
}
