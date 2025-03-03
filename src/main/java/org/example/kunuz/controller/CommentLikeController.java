package org.example.kunuz.controller;

import org.example.kunuz.dto.CommentLikeDto;
import org.example.kunuz.model.CommentLike;
import org.example.kunuz.model.Result;
import org.example.kunuz.service.CommentLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentlike")
public class CommentLikeController {
    @Autowired
    CommentLikeService commentLikeService;

    @GetMapping
    public List<CommentLike> getAll(){
        List<CommentLike> list = commentLikeService.getAll();
        return list;
    }

    @GetMapping("/{id}")
    public CommentLike getById(@PathVariable Integer id){
        return commentLikeService.getById(id);
    }

    @PostMapping
    public Result create(@RequestBody CommentLikeDto commentLikeDto){
        Result result = commentLikeService.create(commentLikeDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CommentLikeDto commentLikeDto){
        Result result = commentLikeService.update(id, commentLikeDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = commentLikeService.delete(id);
        return result;
    }
}
