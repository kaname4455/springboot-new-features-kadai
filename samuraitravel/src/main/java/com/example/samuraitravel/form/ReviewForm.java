package com.example.samuraitravel.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewForm {
    @NotBlank(message = "レビューを入力して下さい")
    private String review;
    
    @NotNull(message = "評価を選択して下さい")
    @Min(value = 1, message = "評価は1以上でなければなりません")
    @Max(value = 5, message = "評価は5以下でなければなりません")
    private Integer rating;
}