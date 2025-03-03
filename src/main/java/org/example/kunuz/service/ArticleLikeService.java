package org.example.kunuz.service;

import org.example.kunuz.dto.ArticleLikeDto;
import org.example.kunuz.model.ArticleLike;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.ArticleLikeRepository;
import org.example.kunuz.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleLikeService {
    @Autowired
    ArticleLikeRepository articleLikeRepository;

    //getAll
    public List<ArticleLike> getAll() {
        return articleLikeRepository.findAll();
    }

    //getById
    public ArticleLike getById(Integer id){
        return articleLikeRepository.findById(id).get();
    }

    //create
    public Result create(ArticleLikeDto articleLikeDto){
        ArticleLike articleLike = new ArticleLike();
        articleLike.setCreated_date(articleLikeDto.getCreated_date());
        articleLike.setStatus(articleLikeDto.getStatus());
        articleLikeRepository.save(articleLike);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, ArticleLikeDto articleLikeDto){
        Optional<ArticleLike> articleLikeOptional = articleLikeRepository.findById(id);
        if (articleLikeOptional.isPresent()){
            ArticleLike articleLike = articleLikeOptional.get();
            articleLike.setCreated_date(articleLikeDto.getCreated_date());
            articleLike.setStatus(articleLikeDto.getStatus());
            articleLikeRepository.save(articleLike);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        articleLikeRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
