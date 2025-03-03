package org.example.kunuz.controller;

import org.example.kunuz.dto.ArticleTypeDto;
import org.example.kunuz.model.ArticleType;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articletype")
public class ArticleTypeController {
    @Autowired
    ArticleTypeService articleTypeService;

    @GetMapping
    public List<ArticleType> getAll(){
        List<ArticleType> list = articleTypeService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public ArticleType getById(@PathVariable Integer id){
        ArticleType articleType = articleTypeService.getById(id);
        return articleType;
    }

    @PostMapping
    public Result create(@RequestBody ArticleTypeDto articleTypeDto){
        Result result = articleTypeService.create(articleTypeDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ArticleTypeDto articleTypeDto){
        Result result = articleTypeService.update(id, articleTypeDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = articleTypeService.delete(id);
        return result;
    }
}
