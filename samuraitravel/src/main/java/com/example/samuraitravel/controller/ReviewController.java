package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.samuraitravel.form.ReviewForm;

import java.util.List;

@Controller
public class ReviewController {

    @GetMapping("/reviews")
    public String showReviewList(Model model) {
        // レビュー一覧表示用
        return "reviewList";
    }

    @GetMapping("/houses/{houseId}/reviews/register")
    public String newReview(@PathVariable Integer houseId, Model model) {
        model.addAttribute("reviewForm", new ReviewForm());
        return "houses/reviewForm";
    
    }
    @GetMapping("/houses/{houseId}/show")
    public String show() {
    public String show(Model model) {
        model.addAttribute("newReview", newReview);        
        return "houses/show";
    }   
}
