package org.example.kunuz.service;

import org.example.kunuz.dto.CommentDto;
import org.example.kunuz.model.Comment;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    //getAll
    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    //getById
    public Comment getById(Integer id){
        return commentRepository.findById(id).get();
    }

    //create
    public Result create(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setCreated_date(commentDto.getCreated_date());
        comment.setUpdated_date(commentDto.getUpdated_date());
        comment.setContent(commentDto.getContent());
        comment.setReply_id(commentDto.getReply_id());
        comment.setVisible(commentDto.getVisible());
        commentRepository.save(comment);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, CommentDto commentDto){
        Optional<Comment> commentOptional = commentRepository.findById(id);
        if (commentOptional.isPresent()){
            Comment comment = commentOptional.get();
            comment.setCreated_date(commentDto.getCreated_date());
            comment.setUpdated_date(commentDto.getUpdated_date());
            comment.setContent(commentDto.getContent());
            comment.setReply_id(commentDto.getReply_id());
            comment.setVisible(commentDto.getVisible());
            commentRepository.save(comment);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        commentRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
