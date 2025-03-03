package org.example.kunuz.repository;

import org.example.kunuz.dto.SavedArticleDto;
import org.example.kunuz.model.SavedArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedArticleRepository extends JpaRepository<SavedArticle,Integer> {
}
