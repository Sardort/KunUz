package org.example.kunuz.service;

import org.example.kunuz.dto.CommentLikeDto;
import org.example.kunuz.model.CommentLike;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.CommentLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentLikeService {
    @Autowired
    CommentLikeRepository commentLikeRepository;

    //getAll
    public List<CommentLike> getAll(){
        return commentLikeRepository.findAll();
    }

    //getById
    public CommentLike getById(Integer id){
        return commentLikeRepository.findById(id).get();
    }

    //create
    public Result create(CommentLikeDto commentLikeDto){
        CommentLike commentLike = new CommentLike();
        commentLike.setCreated_date(commentLikeDto.getCreated_date());
        commentLike.setStatus(commentLikeDto.getStatus());
        commentLikeRepository.save(commentLike);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, CommentLikeDto commentLikeDto){
        Optional<CommentLike> commentLikeOptional = commentLikeRepository.findById(id);
        if (commentLikeOptional.isPresent()){
            CommentLike commentLike = commentLikeOptional.get();
            commentLike.setCreated_date(commentLikeDto.getCreated_date());
            commentLike.setStatus(commentLikeDto.getStatus());
            commentLikeRepository.save(commentLike);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        commentLikeRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
