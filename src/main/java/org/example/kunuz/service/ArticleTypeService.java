package org.example.kunuz.service;

import org.example.kunuz.dto.ArticleTypeDto;
import org.example.kunuz.model.ArticleType;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.ArticleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleTypeService {
    @Autowired
    ArticleTypeRepository articleTypeRepository;

    //getAll
    public List<ArticleType> getAll(){
        return articleTypeRepository.findAll();
    }

    //getById
    public ArticleType getById(Integer id){
        return articleTypeRepository.findById(id).get();
    }

    //create
    public Result create(ArticleTypeDto articleTypeDto){
        ArticleType articleType = new ArticleType();
        articleType.setOrder_number(articleTypeDto.getOrder_number());
        articleType.setName_uz(articleTypeDto.getName_uz());
        articleType.setName_ru(articleTypeDto.getName_ru());
        articleType.setName_en(articleTypeDto.getName_en());
        articleType.setVisible(articleTypeDto.getVisible());
        articleType.setCreated_date(articleTypeDto.getCreated_date());
        articleTypeRepository.save(articleType);
        return new Result(true,"Saqlandi");
    }

    //update
    public Result update(Integer id, ArticleTypeDto articleTypeDto){
        Optional<ArticleType> articleTypeOptional = articleTypeRepository.findById(id);
        if (articleTypeOptional.isPresent()){
            ArticleType articleType = articleTypeOptional.get();
            articleType.setOrder_number(articleTypeDto.getOrder_number());
            articleType.setName_uz(articleTypeDto.getName_uz());
            articleType.setName_ru(articleTypeDto.getName_ru());
            articleType.setName_en(articleTypeDto.getName_en());
            articleType.setVisible(articleTypeDto.getVisible());
            articleType.setCreated_date(articleTypeDto.getCreated_date());
            articleTypeRepository.save(articleType);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        articleTypeRepository.deleteById(id);
        return new Result(true,"Ochirildi");
    }
}
