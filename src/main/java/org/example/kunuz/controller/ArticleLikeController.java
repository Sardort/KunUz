package org.example.kunuz.controller;

import org.example.kunuz.dto.ArticleLikeDto;
import org.example.kunuz.model.ArticleLike;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.ArticleLikeService;
import org.example.kunuz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articlelike")
public class ArticleLikeController {
    @Autowired
    private ArticleLikeService articleLikeService;

    @GetMapping
    public List<ArticleLike>getAll(){
        return articleLikeService.getAll();
    }

    @GetMapping("/{id}")
    public ArticleLike getById(@PathVariable Integer id){
        return articleLikeService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody ArticleLikeDto articleLikeDto){
        Result result = articleLikeService.create(articleLikeDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ArticleLikeDto articleLikeDto){
        Result result = articleLikeService.update(id, articleLikeDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = articleLikeService.delete(id);
        return result;
    }
}
