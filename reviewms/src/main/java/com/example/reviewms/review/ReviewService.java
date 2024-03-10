package com.example.reviewms.review;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    List<Review> getAllReviews(Long id);
    boolean addReview(Long companyId, Review review);

    Review getReview(Long reviewId);
    boolean updateReview(Long reviewId, Review review);

    boolean deleteReview(Long reviewId);
}
