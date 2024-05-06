package org.example.uberreviewservice.service;

import org.example.uberreviewservice.Repository.ReviewRespository;
import org.example.uberreviewservice.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {

    ReviewRespository reviewRespository;

    public ReviewService(ReviewRespository reviewRespository){
        this.reviewRespository=reviewRespository;
    }
    @Override
    public void run(String... args) throws Exception {
          Review r = Review.builder()
                  .content("ride was pretty good")
                  .rating(4.0)
                  .build();
          reviewRespository.save(r);
    }
}
