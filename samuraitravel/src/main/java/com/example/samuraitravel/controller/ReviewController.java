package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel.form.ReviewForm;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @GetMapping
    public String showReviewList(Model model) {
        // レビュー一覧表示用
        return "reviewList";
    }

    @GetMapping("@{/houses/__${house.getId()}__/reviews/register")
    public String newReview(@PathVariable Integer houseId, Model model) {
        model.addAttribute("reviewForm", new ReviewForm());
        return "reviewForm";
    }

    @PostMapping("@{/houses/__${house.getId()}__/reviews/register")
    public String createReview(@PathVariable Integer houseId, @ModelAttribute ReviewForm reviewForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("houseId", houseId);
            return "reviewForm";
        }

    }
}