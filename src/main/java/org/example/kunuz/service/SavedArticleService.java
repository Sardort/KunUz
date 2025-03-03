package org.example.kunuz.service;

import org.example.kunuz.dto.SavedArticleDto;
import org.example.kunuz.model.Result;
import org.example.kunuz.model.SavedArticle;
import org.example.kunuz.repository.SavedArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavedArticleService {
    @Autowired
    SavedArticleRepository savedArticleRepository;

    //getAll
    public List<SavedArticle> getAll(){
        return savedArticleRepository.findAll();
    }

    //getById
    public SavedArticle getById(Integer id){
        return savedArticleRepository.findById(id).get();
    }

    //create
    public Result create(SavedArticleDto savedArticleDto){
        SavedArticle savedArticle = new SavedArticle();
        savedArticle.setCreated_date(savedArticleDto.getCreated_date());
        savedArticleRepository.save(savedArticle);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, SavedArticleDto savedArticleDto){
        Optional<SavedArticle> savedArticleOptional = savedArticleRepository.findById(id);
        if (savedArticleOptional.isPresent()){
            SavedArticle savedArticle = savedArticleOptional.get();
            savedArticle.setCreated_date(savedArticleDto.getCreated_date());
            savedArticleRepository.save(savedArticle);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        savedArticleRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
