package org.example.kunuz.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.kunuz.dto.ArticleDto;
import org.example.kunuz.model.Article;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping
    public List<Article> getAll(){
        return articleService.getAll();
    }

    @GetMapping("/{id}")
    public Article getById(@PathVariable Integer id){
        return articleService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody ArticleDto articleDto){
        Result result = articleService.create(articleDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ArticleDto articleDto){
        Result result = articleService.update(id, articleDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = articleService.delete(id);
        return result;
    }
}
