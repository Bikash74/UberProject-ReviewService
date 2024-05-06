package org.example.uberreviewservice.Repository;

import org.example.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRespository extends JpaRepository<Review,Long> {

}
