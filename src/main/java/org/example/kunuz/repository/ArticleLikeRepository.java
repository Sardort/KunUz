package org.example.kunuz.repository;

import org.example.kunuz.model.ArticleLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleLikeRepository extends JpaRepository<ArticleLike,Integer> {
    Integer id(Integer id);
}
