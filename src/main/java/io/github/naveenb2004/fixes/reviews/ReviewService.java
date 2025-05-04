package io.github.naveenb2004.fixes.reviews;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public final class ReviewService {
    private final String fileName = "";

    public List<Review> getReviews() {
        List<Review> reviews = new ArrayList<>();

        Review review = new Review();
        review.setUser("Naveen");
        review.setComment("This is a comment");
        review.setRating(5);
        review.setTime(LocalDateTime.now());
        reviews.add(review);

        review = new Review();
        review.setUser("Hasindu");
        review.setComment("This is a comment too!");
        review.setRating(3);
        reviews.add(review);

        return reviews;
    }
}
