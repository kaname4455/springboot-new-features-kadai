package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    // 宿ごとのレビューを取得
    public Page<Review> findByInnIdOrderByCreatedAtDesc(Integer innId, Pageable pageable);
    
    // 他のメソッド
    public Page<Review> findByNameLike(String keyword, Pageable pageable);
    public Page<Review> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);
    public Page<Review> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable); 
    public Page<Review> findAllByOrderByCreatedAtDesc(Pageable pageable);
    public Page<Review> findAllByOrderByPriceAsc(Pageable pageable);  
    
    public List<Review> findTop6ByOrderByCreatedAtDesc();
}
