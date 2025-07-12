package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
	public Page<Review> findByNameLike(String keyword, Pageable pageable);
	
    public Page<Review> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword, String addressKeyword, Pageable pageable);  
    public Page<Review> findByNameLikeOrAddressLikeOrderByPriceAsc(String nameKeyword, String addressKeyword, Pageable pageable);  
    public Page<Review> findByAddressLikeOrderByCreatedAtDesc(String area, Pageable pageable);
    public Page<Review> findByAddressLikeOrderByPriceAsc(String area, Pageable pageable);
    public Page<Review> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);
    public Page<Review> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable); 
    public Page<Review> findAllByOrderByCreatedAtDesc(Pageable pageable);
    public Page<Review> findAllByOrderByPriceAsc(Pageable pageable);  
    
    public List<Review> findTop6ByOrderByCreatedAtDesc();
}