package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Review;
import kma.upp.neruhomist.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaReviewRepositoryImpl extends SimpleJpaRepository<Review, Integer> implements ReviewRepository {

    public JpaReviewRepositoryImpl(@Autowired  EntityManager em) {
        super(Review.class, em);
    }
}
