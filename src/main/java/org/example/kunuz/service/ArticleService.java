package org.example.kunuz.service;

import org.example.kunuz.dto.ArticleDto;
import org.example.kunuz.model.Article;
import org.example.kunuz.model.Result;
import org.example.kunuz.model.entity.StatusRole;
import org.example.kunuz.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    //getAll
    public List<Article> getAll(){
        return articleRepository.findAll();
    }

    //getById
    public Article getById(Integer id){
        return articleRepository.findById(id).get();
    }

    //create
    public Result create(ArticleDto articleDto){
        Article article = new Article();
        article.setTitle(articleDto.getTitle());
        article.setDescription(articleDto.getDescription());
        article.setContent(articleDto.getContent());
        article.setShared_count(articleDto.getShared_count());
        article.setImage_id(articleDto.getImage_id());
        article.setModerator_id(articleDto.getModerator_id());
        article.setPublisher_id(articleDto.getPublisher_id());
        article.setStatus(String.valueOf(StatusRole.PUBLISHED));
        article.setCreated_date(articleDto.getCreated_date());
        article.setPublished_date(articleDto.getPublished_date());
        article.setVisible(articleDto.getVisible());
        article.setView_count(articleDto.getView_count());
        articleRepository.save(article);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, ArticleDto articleDto){
        Optional<Article> articleOptional = articleRepository.findById(id);
        if (articleOptional.isPresent()){
            Article article = articleOptional.get();
            article.setTitle(articleDto.getTitle());
            article.setDescription(articleDto.getDescription());
            article.setContent(articleDto.getContent());
            article.setShared_count(articleDto.getShared_count());
            article.setImage_id(articleDto.getImage_id());
            article.setModerator_id(articleDto.getModerator_id());
            article.setPublisher_id(articleDto.getPublisher_id());
            article.setStatus(String.valueOf(StatusRole.PUBLISHED));
            article.setCreated_date(articleDto.getCreated_date());
            article.setPublished_date(articleDto.getPublished_date());
            article.setVisible(articleDto.getVisible());
            article.setView_count(articleDto.getView_count());
            articleRepository.save(article);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        articleRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
