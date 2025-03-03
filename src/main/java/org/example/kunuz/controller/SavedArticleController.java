package org.example.kunuz.controller;

import org.example.kunuz.dto.SavedArticleDto;
import org.example.kunuz.model.Result;
import org.example.kunuz.model.SavedArticle;
import org.example.kunuz.service.SavedArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/savedarticle")
public class SavedArticleController {
    @Autowired
    SavedArticleService savedArticleService;

    @GetMapping
    public List<SavedArticle> getAll(){
        List<SavedArticle> list = savedArticleService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public SavedArticle getById(@PathVariable Integer id){
        SavedArticle savedArticle = savedArticleService.getById(id);
        return savedArticle;
    }

    @PostMapping
    public Result create(@RequestBody SavedArticleDto savedArticleDto){
        Result result = savedArticleService.create(savedArticleDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody SavedArticleDto savedArticleDto){
        Result result = savedArticleService.update(id, savedArticleDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = savedArticleService.delete(id);
        return result;
    }
}
