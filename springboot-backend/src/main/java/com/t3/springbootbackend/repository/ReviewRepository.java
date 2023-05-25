package com.t3.springbootbackend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.springbootbackend.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, UUID> {

}
