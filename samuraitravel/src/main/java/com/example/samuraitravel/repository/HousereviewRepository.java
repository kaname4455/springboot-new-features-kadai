package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;

//HousereviewRepository.java
@Repository
public interface HousereviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByHouse(House house);
}


